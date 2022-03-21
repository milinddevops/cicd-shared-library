package mrc.logic

void action() {
    currentBuild.name = "Test Build" + env.BUILD_NUMBER
    println("Came here in Init")
}