package mrc.common.pipelineState


class pipelineData {
    String applicationName
    String imageTag

    pipelineData(def jenkins, List applicationNames) {
        
    }

    static void setJobParams(def jenkins, List applicationNames) {
        //jenkinspropertiesparameters jpp = new jenkinspropertiesparameters()

        jenkins.properties([
            jenkins.parameters([
                choice(name: 'CHOICES', 
                choices: application, 
                description: 'This is a list of Application to be deployed')
            ])
        ])
    }

}