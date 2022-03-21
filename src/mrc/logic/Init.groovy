package mrc.logic

import mrc.common.pipelineState.pipelineData


pipelineData action(pipelineinfo) {    
    echo "Initalizing for: " + pipelineinfo.applicationName
    return pipelineinfo
}