package com.mrc.stages

import com.mrc.logic.Checkout

void action() {
    stage('Checout') {
        
        new Checout.action()
    }
}