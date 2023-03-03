pipeline{ 
   agent any 
   stages{
     stage('git clone'){ 
        steps{
          git url: 'https://github.com/praneeth6242/openmrs-core.git' 
              branch: 'declerative' 
        }    
     }
     stage('build'){ 
        steps{
          sh 'mvn package' 
        }
     }
   } 
}     