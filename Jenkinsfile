node('JAVA_NODE8'){
  stage('clone'){
    git url: 'https://github.com/praneeth6242/openmrs-core.git' 
        branch: 'scripted' 
  } 
  stage('build') 
    sh script: 'mvn package'  
}