// def call(Map settings = [:]) {
//     node {
//         agent any
//         stages {
//             // stage('Download Source Code') {
//             //         checkout ([$class: "GitSCM", branches: [[name: 'main']], userRemoteConfigs:[[url: "https://github.com/michalsalasa/spring-petclinic.git"]]])
                    
//             // }
//             // stage('Build') {
//             //         // Zbudowanie kodu
//             //         sh 'mvn package -DskipTests'

//             // }
//             // stage('Test') {
//             //     script {
//             //         try {
//             //             if (!settings.skipTests){
//             //         // Uruchomienie testów aplikacji
//             //         sh  'mvn verify'
//             //         // Importowanie wyników testów
//             //         junit '**/target/surefire-reports/*.xml'
//             //     }
//             //         }
//             //         catch (Exception e) {
//             //         archiveArtifacts allowEmptyArchieve: true, artifacts: '**/target/surefire-reports/*.xml'
//             //     }
//             //     }
//             // }
//             stage('Install') {
//                 steps {
//                     // Instalowanie artefaktu w lokalnym repozytorium .m2
//                     // sh 'mvn install -DskipTests'
//                     echo "test się udał"
//                 }
//             }
//         }
//     }
// }
def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
}