package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {    
    sh 'cd pet-clinic; ls -ltr; mvn clean package'    
    sh 'ls -ltr'
}