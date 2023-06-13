def call(Map settings = [:]) {
    node {

            stage('Download Source Code') {
                    // checkout ([$class: "GitSCM", branches: [[name: 'main']], userRemoteConfigs:[[url: "https://github.com/michalsalasa/spring-petclinic.git"]]])
                    checkout scm
            }
            stage('Build') {
                    // Zbudowanie kodu
                    sh 'mvn package -DskipTests'

            }
            stage('Test') {
                script {
                    // try {
                    //     if (!settings.skipTests){
                    // Uruchomienie testów aplikacji
                    sh  'mvn verify'
                    // Importowanie wyników testów
                    junit '**/target/surefire-reports/*.xml'
                    echo "test przeszedl"
                    }
                //     catch (Exception e) {
                //     archiveArtifacts allowEmptyArchieve: true, artifacts: '**/target/surefire-reports/*.xml'
                // }
                }
            
            stage('Install') {
 
                    // Instalowanie artefaktu w lokalnym repozytorium .m2
                    sh 'mvn install -DskipTests'
        }
    }
}