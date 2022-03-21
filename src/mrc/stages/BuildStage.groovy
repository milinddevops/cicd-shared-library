package mrc.stages

import mrc.common.pipelineState.pipelineData
import mrc.logic.Build

def action(pipelineinfo) {
    return stage('BUILD-APP') {
        container('maven') {
            return new Build().action(pipelineinfo)
        }        
    }
}