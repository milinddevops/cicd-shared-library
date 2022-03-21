#!/usr/bin/env groovy

import mrc.common.pipelineState.pipelineData
import mrc.stages.CheckoutStage
import mrc.stages.InitStage
/*import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage*/

def call(List applications) {
    //pipelineData.setJobParams(this, applications)

    properties([
    parameters([
        choice(name: 'APPLICATION_NAME', choices: applications, description: 'Please select application to be deployed.')       

    ])])

    //pipelineData pipelinedata = new pipelineData(this)

    utility.runPipeline('deployPod.yaml') {

        try {
            new CheckoutStage().action()
            
            def obj = new InitStage().action()

        } catch(error) {
        }
    }
}