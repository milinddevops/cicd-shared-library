package mrc.stages

import mrc.logic.Init

def action() {
    return stage('Init') {
        new Init().action()
    }
}