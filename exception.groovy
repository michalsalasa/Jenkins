def pipelineMaven(Map settings = [:]) {
    pipeline {
        // ...

        stages {
            // ...

            if (!settings.skipTests) {
                stage('Test') {
                    steps {
                        // Uruchomienie testów aplikacji za pomocą mvn verify
                        // Importowanie wyników testów za pomocą pluginu JUnit
                        // ...
                    }
                }
            }

            // ...

            if (!settings.skipInstall) {
                stage('Install') {
                    steps {
                        // Instalowanie
