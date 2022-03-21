package mrc.logic

import mrc.common.pipelineState.pipelineData


pipelineData action(pipelineData pipelinedata) {    
    echo "Initalizing for: " + pipelinedata.applicationName
    return pipelinedata
}