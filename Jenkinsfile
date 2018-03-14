pipeline {
    agent {
        label 'master'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tmtsoftware/csw-acceptance.git'
            }
        }
        stage('Acceptance Test') {
            steps {
                sh "sbt cluster-seed/run"
                sh "sbt command/run"
                sh "sbt config-api/run"
                sh "sbt config-client/run"
                sh "sbt config-client-cli/run"
                sh "sbt config-server/run"
                sh "sbt framework/run"
                sh "sbt location/run"
                sh "sbt logging/run"
                sh "sbt messages/run"
            }
        }
    }

    post {
        always {
            script {
                sendNotification(currentBuild.result)
            }
        }
    }
}

def sendNotification(String buildStatus = 'STARTED') {
    buildStatus = buildStatus ?: 'SUCCESSFUL'

    def colorName = 'RED'
    def colorCode = '#FF0000'
    def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
    def summary = "${subject} (${env.BUILD_URL})"
    def details = '${JELLY_SCRIPT,template="html"}'

    // Override default values based on build status
    if (buildStatus == 'STARTED') {
        color = 'YELLOW'
        colorCode = '#FFFF00'
    } else if (buildStatus == 'SUCCESSFUL') {
        color = 'GREEN'
        colorCode = '#00FF00'
    } else {
        color = 'RED'
        colorCode = '#FF0000'
        emailext(
                    subject: subject,
                    body: details,
                    to: "tmt-csw@thoughtworks.com"
            )
    }

    slackSend(channel: "#acceptance-dev", color: colorCode, message: summary)
}
