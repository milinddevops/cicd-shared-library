void runPipeline(String podYaml, Closure pippeline) {
    def strPodYaml = libraryResource "$podYaml"

    podTemplate(yaml: strPodYaml) {
        node(label) {
            disableConcurrentBuilds()
            timeout(60) {               
                pippeline.call()           
            }
        }
    }
}
