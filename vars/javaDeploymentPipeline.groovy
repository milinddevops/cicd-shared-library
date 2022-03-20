#!/usr/bin/env groovy

import mrc.common.pipelineState.pipelineData
import mrc.stages.CheckoutStage
/*import com.mrc.stages.InitStage
import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage*/

def call(List applications) {
    //pipelineData.setJobParams(this, applications)
    this.parameters([
            choice(name: 'CHOICES', choices: [applications], description: 'This is a list of Application to be deployed'
        )])

    //pipelineData pipelinedata = new pipelineData(this)

    utility.runPipeline('deployPod.yaml') {

        try {
            new CheckoutStage().action()


        } catch(error) {
        }
    }
}