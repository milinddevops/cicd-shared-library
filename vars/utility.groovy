void runPipeline(String podYaml, Closure pippeline) {
    def strPodYaml = libraryResource "$podYaml"

    podTemplate(yaml: strPodYaml) {
        node(POD_LABEL) {
            disableConcurrentBuilds()
            timeout(60) {               
                pippeline.call()           
            }
        }
    }
}