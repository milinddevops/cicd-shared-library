package mrc.common.pipelineData

class pipelineData {
    String applicationName
    String imageTag

    pipelineData(def jenkins, List applicationNames) {
        
    }

    static void setJobParams(def jenkins, List applicationNames) {
        JenkinsPropertiesParameters jpp = new JenkinsPropertiesParameters()

        jenkins.properties([
            jenkins.parameters([
                jpp.applicationNames(applicationNames)
            ])
        ])
    }

}