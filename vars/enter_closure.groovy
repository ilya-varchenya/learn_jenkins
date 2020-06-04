def call(List methods) {
    node('master') {
        for (method in methods) {
            sh method()
        }
    }
}