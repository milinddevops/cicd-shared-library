package mrc.common.pipelineState

// Show application list
def applicationNames(def jenkins, List applicationNames ) {
    List applications = []
    application.addAll(applicationNames)

    return jenkins.choice(name: 'CHOICES', 
                choices: application, 
                description: 'This is a list of Application to be deployed'
            )
}