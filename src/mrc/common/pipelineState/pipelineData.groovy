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
                choice(name: 'size', choices: ['S': 'S', 'L': 'L', 'M': 'M'],  description: 'Size choice (S/M/L)')
        ])])
        /*properties([
            parameters([
                choice(name: 'CHOICES', choices: applicationNames, description: 'This is a list of Application to be deployed'
            )
        ])])*/
    }

}