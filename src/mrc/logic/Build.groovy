package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    echo "BUILD APP${pipelineinfo.applicationName}"
}