package mrc.logic

import mrc.common.pipelineState.pipelineData

def action(pipelineinfo) {
    sh 'ls -ltr ./pet-clinic'
    sh 'cd pet-clinic'
    sh 'mvn clean package'
    sh 'ls -ltr ./pet-clinic'
}