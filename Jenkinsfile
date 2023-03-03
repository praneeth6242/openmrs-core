pipeline{ 
   agent {  node {label 'JAVA_NODE8'} }
   stages{
     stage('git clone'){ 
        steps{
          git url: 'https://github.com/praneeth6242/openmrs-core.git',
              branch: 'declerative' 
        }    
     }
     stage('build'){ 
        steps{ 
          sh "export 'PATH=/usr/lib/jvm/java-1.8.0-openjdk-amd64/bin:$PATH'"  
          sh 'mvn package' 
        }
     }
   } 
}     