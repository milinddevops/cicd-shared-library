void runPipeline(String podYaml, Closure pippeline) {
    def strPodYaml = libraryResource podYaml

    podTemplate(yaml: strPodYaml) {
        node(POD_LABEL) {
            timeout(60) {
                pippeline.call()
            }
        }
    }
}