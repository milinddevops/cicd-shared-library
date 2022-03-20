#!/usr/bin/env groovy

import mrc.common.pipelineState.pipelineData
import mrc.stages.CheckoutStage
/*import com.mrc.stages.InitStage
import com.mrc.stages.BuildStage
import com.mrc.stages.DeployStage*/

def call(List applications) {
    //pipelineData.setJobParams(this, applications)
        this.properties([
            this.parameters([
                booleanParam(defaultValue: false, name: 'BuildAll', description: ''),
                [$class: 'ChoiceParameter', choiceType: 'PT_CHECKBOX',
                    description: 'Choose environment category.',
                    name: 'ENVIRONMENT',
                    script: [
                        $class: 'GroovyScript',
                        script: [sandbox: true, script: 'return ["QA", "DEV", "PROD"]']
                    ]
                ]
            ])
        ])

    //pipelineData pipelinedata = new pipelineData(this)

    utility.runPipeline('deployPod.yaml') {

        try {
            new CheckoutStage().action()


        } catch(error) {
        }
    }
}