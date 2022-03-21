package mrc.logic

import mrc.common.pipelineState.pipelineData


def action(pipelineData pipelinedata) {    
    echo "Initalizing for: " + pipelinedata.applicationName
    return pipelinedata
}