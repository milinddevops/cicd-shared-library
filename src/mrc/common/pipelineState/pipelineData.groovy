package mrc.common.pipelineState


class pipelineData {
    String applicationName
    String imageTag

    pipelineData(def jenkins, List applicationNames) {
        
    }

    static void setJobParams(def jenkins, List applicationNames) {
        jenkinspropertiesparameters jpp = new jenkinspropertiesparameters()

        jenkins.properties([
            jenkins.parameters([
                jpp.applicationNames(applicationNames)
            ])
        ])
    }

}