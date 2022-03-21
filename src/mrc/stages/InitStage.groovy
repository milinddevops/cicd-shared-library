package mrc.stages

import mrc.logic.Init
import mrc.common.pipelineState.pipelineData

def action(pipelineData pipelinedata) {
    return stage('Init') {
        new Init().action(pipelinedata)
    }
}