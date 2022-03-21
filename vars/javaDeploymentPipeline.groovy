#!/usr/bin/env groovy

import mrc.common.pipelineState.pipelineData
import mrc.stages.CheckoutStage
import mrc.stages.InitStage
/*import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage*/

def call(List applications) {
    pipelineData.setJobParams(this, applications)
    pipelineData pipelinedata = new pipelineData(this)

    utility.runPipeline('deployPod.yaml') {

        try {
            new CheckoutStage().action()

            pipelineData = new InitStage().action(pipelineData)

        } catch(error) {
            echo error.message
        }
    }
}