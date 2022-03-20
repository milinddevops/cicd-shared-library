package mrc.stages

import mrc.logic.Checkout

void action() {
    stage('Checout') {        
         new Checkout().action()
    }
}