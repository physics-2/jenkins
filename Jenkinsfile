pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
        timeout(time: 20, unit: 'MINUTES')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn -B clean verify'
                    } else {
                        bat 'mvn -B clean verify'
                    }
                }
            }

            post {
                always {
                    junit(
                        testResults: '/target/surefire-reports/TEST-*.xml,/target/failsafe-reports/TEST-*.xml',
                        allowEmptyResults: true
                    )
                }
            }
        }

        stage('Save JAR') {
            steps {
                archiveArtifacts(
                    artifacts: '**/target/*.jar',
                    fingerprint: true
                )
            }
        }
    }
}