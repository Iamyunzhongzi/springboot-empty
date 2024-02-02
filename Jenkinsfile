pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '29529f33-aadc-4d4a-9aa5-5a60e87a60e4', url: 'https://github.com/Iamyunzhongzi/springboot-empty.git']])
            }
        }

        stage('build code') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('publish code') {
            steps {
                deploy adapters: [tomcat8(credentialsId: '0803982e-6183-4525-a67b-5573f94dee6e', path: '', url: 'http://120.79.231.30:8080/')], contextPath: null, war: 'target/*.war'
            }
        }
    }
}
