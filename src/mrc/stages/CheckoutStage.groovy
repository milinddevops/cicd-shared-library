package com.mrc.stages

import com.mrc.logic.Checkout

void action() {
    stage('Checout') {        
         checkout(scm: jenkins.scm)
    }
}