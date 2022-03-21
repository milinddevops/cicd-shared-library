package mrc.stages

import mrc.logic.Init
import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    return stage('Init') {
        return new Init().action(pipelineinfo)
    }
}