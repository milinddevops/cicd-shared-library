package mrc.stages

import mrc.logic.Init

action() {
    return stage('Init') {
        new Init().action()
    }

    return this
}