package mrc.logic

import mrc.common.pipelineState.pipelineData


def action(pipelineinfo) {    
    echo "Initalizing for: " + pipelineinfo.applicationName
    pipelineinfo.jenkins.currentBuild.displayName = "TEST: BUILD-${env.BUILD_NUMBER}"
    return pipelineinfo
}