#!groovy

def call(jobName, parameters){
    //trigger downstream pipeline job
    build job: jobName, parameters: parameters
}