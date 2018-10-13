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
                sh "sbt admin-server/run"
                sh "sbt location-server/run"
                sh "sbt config-api/run"
                sh "sbt config-server/run"
                sh "sbt config-client/run"
                sh "sbt config-client-cli/run"
                sh "sbt logging/run"
                sh "sbt params/run"
                sh "sbt command/run"
                sh "sbt framework/run"
                sh "sbt event-client/run"
                sh "sbt event-cli/run"
                sh "sbt alarm-api/run"
                sh "sbt alarm-client/run"
                sh "sbt alarm-cli/run"
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
