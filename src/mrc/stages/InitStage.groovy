package mrc.stages

import mrc.logic.Init

def action(pipelineData pipelinedata) {
    return stage('Init') {
        new Init().action(pipelinedata)
    }
}