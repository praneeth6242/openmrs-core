pipeline{ 
   agent any 
   stages{
     stage('git clone'){
        git url: 'https://github.com/praneeth6242/openmrs-core.git' 
            branch: 'declerative'
     }
     stage('build'){
        sh 'mvn package'
     }
   } 
}     