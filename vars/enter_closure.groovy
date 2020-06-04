def call(Closure body) {
    def parameters = body
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = parameters

    echo "111"

    node('master') {
        echo "222"
        echo body.methods
        echo "333"
        body()
    }
}