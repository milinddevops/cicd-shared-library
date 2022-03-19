package com.mrc.stages

import com.mrc.logic.Checkout

void action() {
    return stage('Checout') {
        
        return new Checout.action()
    }
}