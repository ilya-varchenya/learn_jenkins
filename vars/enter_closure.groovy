def call(Map body) {
    node('master') {
        echo body.methods

        for (method in body.methods) {
            sh method
        }

    }
}