package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {    
    sh 'cd pet-clinic; ls -ltr'
    sh 'mvn package'
    sh 'ls -ltr ./pet-clinic'
}