package mrc.stages

import mrc.logic.Checkout

void action() {
    return stage('Checkout') {        
         new Checkout().action()
    }
}