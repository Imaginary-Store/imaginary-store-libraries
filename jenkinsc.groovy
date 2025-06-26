node {
    stage('SonarCloud analysis') {
        withSonarQubeEnv() { // Will pick the global server connection you have configured
            sh './gradlew sonar'
        }
    }
}