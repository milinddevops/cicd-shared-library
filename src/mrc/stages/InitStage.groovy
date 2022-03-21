package mrc.stages

import mrc.logic.Init
import mrc.common.pipelineState.pipelineData

pipelineData action(pipelineData pipelinedata) {
    return stage('Init') {
        return new Init().action(pipelinedata)
    }
}