#!/usr/bin/env groovy

import mrc.common.pipelineState.pipelineData
import mrc.stages.CheckoutStage
/*import com.mrc.stages.InitStage
import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage*/

def call(List applications) {
    pipelineData.setJobParams(this, applications)
    
    /*properties([
    parameters([
        choice(name: 'size', choices: ['S', 'M', 'L'],  description: 'Size choice (S/M/L)')
    ])]) */

    //pipelineData pipelinedata = new pipelineData(this)

    utility.runPipeline('deployPod.yaml') {

        try {
            new CheckoutStage().action()


        } catch(error) {
        }
    }
}