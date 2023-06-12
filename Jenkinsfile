library 'Jenkins DSL Library'

pipeline {
    agent none
    stages {
        stage ('Checkout') {
            agent {label 'agent'}
            steps {
                script {
                    echo "test"
                }
                pipelineMaven()
            }
        }
    }
}