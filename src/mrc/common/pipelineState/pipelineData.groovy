package mrc.common.pipelineState


class pipelineData {
    String applicationName
    String imageTag

    pipelineData(def jenkins, List applicationNames) {
        
    }

    static void setJobParams(def jenkins, List applicationNames) {
        jenkins.properties([
            jenkins.parameters([
                jenkinspropertiesparameters().applicationNames(applicationNames)
            ])
        ])
    }

}