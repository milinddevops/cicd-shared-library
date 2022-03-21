package mrc.stages

import mrc.logic.Init
import mrc.common.pipelineState.pipelineData

pipelineData action(pipelineData pipelineinfo) {
    return stage('Init') {
        return new Init().action(pipelineinfo)
    }
}