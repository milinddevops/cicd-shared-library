package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    sh 'ls -ltr'
    sh 'mvn clean package ./pet-clinic'
    sh 'ls -ltr ./pet-clinic'
}