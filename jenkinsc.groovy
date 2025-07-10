pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
        stage('SonarCloud analysis') {
            steps {
                withSonarQubeEnv() { // Will pick the global server connection you have configured
                    sh './gradlew sonar'
                }
            }
        }
    }
}