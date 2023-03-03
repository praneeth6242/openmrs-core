node('JAVA_NODE8'){
  stage('clone'){
    git url: 'https://github.com/praneeth6242/openmrs-core.git',
        branch: 'scripted' 
  } 
  stage('build'){ 
    sh "export 'PATH=/usr/lib/jvm/java-1.8.0-openjdk-amd64/bin:$PATH'"
    sh  'mvn package'
  }  
}