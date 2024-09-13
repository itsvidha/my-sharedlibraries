import com.vidhac.builds.Calculator;
Calculator calculator=new Calculator(this)
def call(Map pipelineParams){
        pipeline {
        agent any 
        environmet{
            appName= ${pipelineParams.appname}
        }
        stages{
            stage('AdditionStage'){
                steps{
                    echo("printing sum of 2 numbers")
                    println calculator.add(10,20)
                    echo "this is ${appName}"
                }
            }
            stage('MultiplyingStage'){
                steps{
                    echo("printing multiplication of 2 numbers")
                    println calculator.mul(10,20)
                }
            }
            stage('mailing'){
                steps{
                    echo("mail has been sent")

                }
            }
        }
    }
}
