package mrc.common.pipelineState


class pipelineData {
    String applicationName
    String imageTag
    def jenkins

    pipelineData(def jenkins) {
        def params = jenkins.params

        this.applicationName = params.APPLICATION_NAME
        this.jenkins = jenkins
    }

    static void setJobParams(def jenkins, List applicationNames) {        
        //jenkinspropertiesparameters jpp = new jenkinspropertiesparameters()
        jenkins.properties([
            jenkins.parameters([
                //jpp.applicationNames(jenkins, applicationNames)
                jenkins.choice(name: 'APPLICATION_NAME', choices: applicationNames, description: 'This is a list of Application to be deployed')                
        ])])
    }

}