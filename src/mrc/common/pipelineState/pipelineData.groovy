package mrc.common.pipelineState


class pipelineData {
    String applicationName
    String imageTag

    pipelineData(def jenkins) {
        
    }

    static void setJobParams(def jenkins, List applicationNames) {
        JenkinsPropertiesParameters jpp = new jenkinspropertiesparameters()

        jenkins.properties([
            jenkins.parameters([
                jpp.choice(applicationNames)
        ])])
    }

}