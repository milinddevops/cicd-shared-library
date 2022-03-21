#!/usr/bin/env groovy

import mrc.common.pipelineState.pipelineData
import mrc.stages.CheckoutStage
import mrc.stages.InitStage
import mrc.stages.BuildStage
import mrc.stages.DockerStage
/*import mrc.stages.DeployStage*/

def call(List applications) {
    pipelineData.setJobParams(this, applications)
    pipelineinfo = new pipelineData(this)

    utility.runPipeline('deployPod.yaml') {

        try {
            new CheckoutStage().action()

            pipelineinfo = new InitStage().action(pipelineinfo)

            pipelineinfo = new BuildStage().action(pipelineinfo)

            pipelineinfo = new DockerStage().action(pipelineinfo)      
            
        } catch(error) {
            echo error.message
        }
    }
}