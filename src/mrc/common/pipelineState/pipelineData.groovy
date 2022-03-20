package mrc.common.pipelineState


class pipelineData {
    String applicationName
    String imageTag

    pipelineData(def jenkins) {
        
    }

    static void setJobParams(def jenkins, List applicationNames) {
        //jenkinspropertiesparameters jpp = new jenkinspropertiesparameters()

        properties([
            parameters([
                new jenkinspropertiesparameters().choice(applicationNames)
        ])])
    }

}