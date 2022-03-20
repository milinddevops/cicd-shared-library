package mrc.common.pippelineData

// Show application list
def applicationNames(List applicationNames) {
    List applications = []
    application.addAll(applicationNames)

    return choice(name: 'CHOICES', 
                choices: application, 
                description: 'This is a list of Application to be deployed')
}