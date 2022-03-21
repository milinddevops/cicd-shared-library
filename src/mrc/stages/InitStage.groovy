package mrc.stages

import mrc.logic.Init

action() {
    return stage('Init') {
         echo "Came here in Init"
        //new Init().action()
    }
}