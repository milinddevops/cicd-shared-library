void runPipeline(String podYaml, Closure pippeline) {
    def strPodYaml = libraryResource "$podYaml"

    podTemplate(label: 'maven', containers: [
            containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat'),
            containerTemplate(name: 'jnlp', image: 'jenkins/jnlp-slave:3.10-1-alpine', args: '${computer.jnlpmac} ${computer.name}', workspaceVolume: 'hostPath  /c/Users/MilindChavan/k8s/app-dependencies')
    ])  {
        node(POD_LABEL) {
            disableConcurrentBuilds()
            timeout(60) {               
                pippeline.call()           
            }
        }
    }
}