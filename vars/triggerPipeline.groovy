#!groovy

def call(jobName, parameters){
    //trigger downstream pipeline job
    println parameters
    def job = build job: jobName, parameters: parameters
}