package mrc.logic

action() {
    currentBuild.name = "Test Build" + env.BUILD_NUMBER
    echo "Came here in Init"
}