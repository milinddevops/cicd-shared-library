#!/usr/bin/env groovy

import mrc.stages.CheckoutStage
/*import com.mrc.stages.InitStage
import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage*/

def call() {    
    utility.runPipeline('deployPod.yaml') {
        try {
            new CheckoutStage().action()
        } catch(error) {
        }
    }
}