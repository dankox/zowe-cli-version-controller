package org.zowe.pipelines

class NodeJS {
    def node
    NodeJS(steps) { this.node = node }

    def setup(String test) {
        // steps.step('setup') {
        //     sh: "echo ${test}"
        // }
        node {
            stage('setup') {
                sh: "echo ${test}"
            }
        }
    }
}
