package com.mrc.stages

import com.mrc.logic.Checkout

void action() {
    return stage('Checout') {
        
        new Checout.action()
    }
}