package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    container('maven') {
        sh 'cd pet-clinic; ls -ltr; mvn clean package;ls -ltr'
    }

    return pipelineinfo   
}