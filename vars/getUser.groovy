def call(string username="null" ,string designation="null") {
  echo "this is a test shared library setup"
  pipeline {
    environment {
        USER_NAME="username"
        DESIGNATION="designation"
    }
    agent any
    stages {
      stage ( "Print" ) {
        steps {
          echo " Hi ${USER_NAME}, Your Designation is ${DESIGNATION}" 
        }
      }
    }
}
