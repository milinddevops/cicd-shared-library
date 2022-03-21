package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    withDockerRegistry(toolName: 'Docker', url: 'https://index.docker.io/v1/', credentialsId: 'dockercreds',) {
        dir('pet-clinic') {
            def custImage = docker.build("milinddocker/cicd:${pipelineinfo.imageTag}")
            custImage.push()
        }
    }
}