def call(Closure body) {
    def parameters = body
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = parameters

    echo "111"
    body()
    echo "222"
    node('master') {
        echo "333"
        for (method in parameters) {
            echo "444"
            echo method()
        }
    }
}