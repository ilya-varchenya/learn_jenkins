def call(Closure body) {
    def parameters = [:]
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = parameters

    methods = parameters.methods
    echo "111"
    body()
    echo "222"
    node('master') {
        echo "333"
        for (method in methods) {
            echo "444"
            echo method()
        }
    }
}