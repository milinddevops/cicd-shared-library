package mrc.stages

import mrc.logic.Init

void action() {
    stage('Init') {
        new Init().action()
    }
}