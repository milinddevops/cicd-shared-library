#!/usr/bin/env groovy

import mrc.common.pipelineState.pipelineData
import mrc.stages.CheckoutStage
import mrc.stages.InitStage
/*import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage*/

def call(List applications) {
    pipelineData.setJobParams(this, applications)
    pipelineinfo = new pipelineData(this)

    utility.runPipeline('deployPod.yaml') {

        try {
            new CheckoutStage().action()

            pipelineinfo = new InitStage().action(pipelineinfo)

        } catch(error) {
            echo error.message
        }
    }
}