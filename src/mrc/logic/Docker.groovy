package mrc.logic

import mrc.common.pipelineState.pipelineData
//import mrc.common.pipelineUtility

def action(pipelineinfo) {

    container('docker') {
        withCredentials([usernamePassword(credentialsId:'dockercreds', passwordVariable: 'Password', usernameVariable: 'Username')]) {
            sh ''' 
               docker login -u ${Username} -p ${Password}"
               docker build .
               '''

        }
    }

    return pipelineinfo
}