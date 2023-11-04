pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                echo "Project Cleaning..........."
                bat "mvn clean"
            }
        }
        stage('Build') {
            steps {
                echo "Project Building..........."
                bat "mvn build"
            }
        }
        stage('Test') {
            steps {
                echo "Project Testing..........."
                bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Project Deployinging..........."
                bat "mvn deploy"
            }
        }
    }
}
