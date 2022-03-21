package mrc.common.pipelineState


class pipelineData {
    String applicationName
    String imageTag

    pipelineData(def jenkins) {
        def params = jenkins.params

        this.applicationName = params.APPLICATION_NAME
    }

    static void setJobParams(def jenkins, List applicationNames) {        
        jenkins.properties([
            jenkins.parameters([
                jenkins.choice(name: 'APPLICATION_NAME', choices: applicationNames, description: 'This is a list of Application to be deployed')                
        ])])
    }

}