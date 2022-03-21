package mrc.stages

import mrc.logic.InitStage

void action() {
    stage('Init') {
        new Init().action()
    }
}