package mrc.logic

import mrc.common.pipelineState.pipelineData
//import mrc.common.pipelineUtility

def action(pipelineinfo) {

    container('docker') {
        sh "docker login -u ${env.milinddockerUser} -p ${env.milinddockerPassword}"
    }

    return pipelineinfo
}