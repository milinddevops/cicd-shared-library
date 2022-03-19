package com.mrc.stages

import com.mrc.logic.Checkout

def checkOutFrom() {
    checkout(scm: jenkins.scm)
}

return this

/*void action() {     
    new Checout.action()
}*/