#!/usr/bin/env bash

packageList=(admin-server location-server config-api config-server config-client config-cli logging params command-client framework event-client event-cli alarm-api alarm-client alarm-cli)
#packageList=(admin-server location-server)

# Test use a reporter to output results to a local file, testReport.txt, in each package.
# We will collect all test results into a single file for publishing
filebase=testReport.txt

if [[ -f ${filebase} ]] ; then
    rm ${filebase}
fi

touch ${filebase}

prettyDate=`date`
terseDate=`date +%Y%m%d_%H%M%S`

echo -e "CSW Acceptance Testing Report\tRun started\t${prettyDate}" >> ${filebase}
# Note: delimiter for the following line should match that in FileAcceptanceTestReporter
echo -e "Class\tTest Name\tResult" >> ${filebase}

for package in "${packageList[@]}"
do
    file=${package}/${filebase}

    if [[ -f ${file} ]] ; then
        rm ${file}
    fi

    sbt ${package}/run

    # concatenate all results into a single file
    cat ${file} >> ${filebase}

done

gitfile=${terseDate}_csw_acceptance_results.tsv
uri=https://api.github.com/repos/tmtsoftware/csw-acceptance/contents/results/${gitfile}

# create new file on github, using access token stored in GIT_TOKEN environment variable
curl -X PUT -H "Authorization: token ${GIT_TOKEN}" ${uri}  -d "{\"message\":\"CSW Acceptance Report for ${prettyDate}\",\"committer\":{\"name\":\"jasonweiss\",\"email\":\"jweiss@tmt.org\"},\"content\":\"`base64 ${filebase}`\"}"
