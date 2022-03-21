package mrc.stages

import mrc.logic.Init

void action() {
    return stage('Init') {
        new Init().action()
    }
}