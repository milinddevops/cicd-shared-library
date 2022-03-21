package mrc.stages

import mrc.common.pipelineState.pipelineData
import mrc.logic.Build

def action(pipelineinfo) {
    return stage('App-Build') {
        container('maven') {
            pipelineinfo new Build().action(pipelineinfo)
        }

        return pipelineinfo       
    }
}