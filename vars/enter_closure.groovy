def call(Closure parameters) {
    node('master') {
        for (parameter in parameters) {
            parameter()
        }
    }
}