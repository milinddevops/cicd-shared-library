package mrc.logic

import mrc.common.pipelineState.pipelineData


pipelineData action(pipelineData pipelineinfo) {    
    echo "Initalizing for: " + pipelineinfo.applicationName
    return pipelineinfo
}