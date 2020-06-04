def call(Map body) {
    node('master') {
        for (method in body.methods) {
            sh method()
        }
    }
}