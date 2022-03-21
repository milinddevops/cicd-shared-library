package mrc.stages

import mrc.common.pipelineState.pipelineData
import mrc.logic.Docker

def action(pipelineinfo) {
    return stage('Docker-Build') {
        container('Docker') {
            return new Docker().action(pipelineinfo)
        }        
    }
}