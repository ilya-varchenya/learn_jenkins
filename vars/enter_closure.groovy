def call(Closure body) {
    def parameters = [:]
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = parameters

    methods = parameters.methods

    echo body()

    node('master') {
        for (method in methods) {
            echo method()
        }
    }
}