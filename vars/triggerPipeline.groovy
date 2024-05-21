#!groovy

def call(jobName, parameters){
    //trigger downstream pipeline job
    def job = build job: jobName, parameters: parameters
}