package mrc.stages

import mrc.logic.Checkout

void action() {
    stage('Checout') {        
         checkout(scm: jenkins.scm)
    }
}