def pipelineMaven(Map settings = [:]) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    // Pobranie kodu źródłowego
                    git branch: 'master', url: https://github.com/spring-projects/spring-petclinic.git
                }
            }
            stage('Build') {
                steps {
                    // Zbudowanie kodu
                    sh 'mvn package -DskipTests'
                }
            }
            stage('Test') {
                steps {
                    // Uruchomienie testów aplikacji
                    sh  'mvn verify'
                    // Importowanie wyników testów
                    junit '**/target/surefire-reports/*.xml'
                }
            }
            stage('Install') {
                steps {
                    // Instalowanie artefaktu w lokalnym repozytorium .m2
                    sh 'mvn install -DskipTests'
                }
            }
        }
    }
}
