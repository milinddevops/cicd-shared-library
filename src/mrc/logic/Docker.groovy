package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    sh "cd ${pipelineinfo.applicationName}; docker build -t ${pipelineinfo.imageTag} ."

    withCredentials([usernamePassword(credentialsId: 'milinddocker', passwordVariable: 'milinddockerPassword', usernameVariable: 'milinddockerUser')]) {
        sh "docker login -u ${env.milinddockerUser} -p ${env.milinddockerPassword}"
        sh "docker push milinddocker/cicd::${pipelineinfo.imageTag}"
    }

    return pipelineinfo
}