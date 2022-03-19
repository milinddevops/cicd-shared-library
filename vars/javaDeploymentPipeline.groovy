#!/usr/bin/env groovy

import com.mrc.stages.CheckoutStage
import com.mrc.stages.InitStage
import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage

def call() {
    utility.runPipeline('deployPOd.yaml') {
        try {
            new CheckoutStage.action()
        } catch(error) {
        }
    }
}