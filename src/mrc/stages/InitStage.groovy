package mrc.stages

import mrc.logic.Init
import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    return stage('Init') {
        pipelineinfo = new Init().action(pipelineinfo)
        return pipelineinfo
    }
}