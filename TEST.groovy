pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        echo 'Hi, '
                        echo 'We are Starting the Testing'
                  }
            }
            stage('Build') {
                  steps {
                        echo 'Building Sample Maven Project'
                  }
            }
             stage('Smoke Test') {
                  steps {
                        echo "Testing"
                  }
            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area"
                  }
            }
            stage('Deploy Production') {
                  steps {
                        echo "Deploying in Production Area ..."
                        echo "Goodbye .."
                  }
            }
      }
}