package mrc.logic

import mrc.common.pipelineState.pipelineData


def action(pipelineinfo) {    
    echo "Initalizing for: " + pipelineinfo.applicationName
    return pipelineinfo
}