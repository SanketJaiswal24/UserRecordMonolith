pipeline {
  /*Jenkins Slave is Docker Container*/
 agent {
      node {
        label 'DockerSlave'
    }
  }  
    stages {
  
        /*Compile stage*/
        stage('Compile stage')
        {
          steps
          {
            sh './listdir.sh'
            /*sh 'mvn clean compile'*/
          }
        }

        /*Package stage*/  
        stage('Package Stage') 
        {
            steps 
            {
           /*sh 'mvn package'*/
              sh 'pwd'
            }   
        }
      
        /*Build Dcoker Image*/ 
        stage('Build Docker Image')
        {
             steps
             {
                sh 'pwd'
               /*sh 'pwd'*/
          /*  sh "docker build -t localhost:5000/spring-boot-apache-derby-docker2.0.0${env.BUILD_NUMBER} ." */
             }
        }

        /*Push Docker images in Local-Docker-Registry */
        stage('Push Docker Image'){
           steps
           {
             sh 'pwd'
           /* sh "docker push localhost:5000/spring-boot-apache-derby-docker2.0.0${env.BUILD_NUMBER}" */
           }
         }

         stage('Publish Jacoca Report')
         {
           steps
           {
             //sh 'mvn clean test jacoco:report'
              /*Publish Jacoca Report in Jenkins Dashboard */
           // junit 'target/**/*.xml'
           // step([
             // $class           : 'JacocoPublisher',
              //execPattern      : 'target/jacoco.exec',
             // sourcePattern    : '**/src/main/java'
           //])
           sh 'pwd' 
           }
         }

       /* Run Image in Dev Server*/
       stage('Run Container on Dev Server')
       {  
        steps
           {
            sh 'pwd'
          /*sh "docker run -d -p 8085:8085 localhost:5000/spring-boot-apache-derby-docker2.0.0${env.BUILD_NUMBER}"*/
       }
      }     
  }
    /*Post Decleration*/
    post {

        always {
           echo 'Post action running'
          //  sh 'find ${WORKSPACE} -type f -print '
         }
        
        success {
            
            echo 'I am Success Done'
            
           /*slack Notification Incomming Webhook*/
           slackSend baseUrl: 'https://hooks.slack.com/services/', channel: 'build', color: 'good', message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})", tokenCredentialId: 'slack-integration'
            
        }
        
        failure {

          /*slack Notification Incomming Webhook*/
          slackSend baseUrl: 'https://hooks.slack.com/services/', channel: 'build', color: 'bad', message: "FAILURE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})", tokenCredentialId: 'slack-integration'
       
        }

    }
}