package mrc.logic

import mrc.common.pipelineState.pipelineData


def action(pipelineinfo) {    
    echo "Initalizing for: " + pipelineinfo.applicationName
    pipelineinfo.jenkins.currentBuild.displayName = "${pipelineinfo.applicationName}-BUILD-${env.BUILD_NUMBER}"
    //pipelineinfo.imageTag = "${pipelineinfo.applicationName}-BUILD-${env.BUILD_NUMBER}"
    return pipelineinfo
}