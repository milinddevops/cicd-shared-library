package mrc.stages

import mrc.logic.Checkout

void action() {
    return stage('Checout') {        
         new Checkout().action()
    }
}