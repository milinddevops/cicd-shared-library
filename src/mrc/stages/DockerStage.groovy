package mrc.stages

import mrc.common.pipelineState.pipelineData
import mrc.logic.Build

def action(pipelineinfo) {
    return stage('Docker-Build') {
        container('Docker') {
            return new Docker().action(pipelineinfo)
        }        
    }
}