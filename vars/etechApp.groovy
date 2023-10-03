def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Tools Initialization") {
               steps {
                     sh 'java -version'
               }
           }
           stage("Checkout code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("To-test-maven") {
               steps {
                   sh 'lsblk'
               }
           }
       }
}
}