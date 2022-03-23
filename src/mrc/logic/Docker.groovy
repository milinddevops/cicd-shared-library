package mrc.logic

import mrc.common.pipelineState.pipelineData
//import mrc.common.pipelineUtility

def action(pipelineinfo) {
    sh "cd ${pipelineinfo.applicationName}; docker build -t ${pipelineinfo.imageTag} ."

    /*pipelineUtility.buildDockerImg(pipelineinfo) {

    }*/

    withCredentials([usernamePassword(credentialsId: 'milinddocker', passwordVariable: 'milinddockerPassword', usernameVariable: 'milinddockerUser')]) {
        sh "docker login -u ${env.milinddockerUser} -p ${env.milinddockerPassword}"
        sh "docker push milinddocker/cicd::${pipelineinfo.imageTag}"
    }

    return pipelineinfo
}