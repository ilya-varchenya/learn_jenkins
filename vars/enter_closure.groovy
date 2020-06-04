def call(Closure body) {

    echo "111"
    node('master') {
        echo "222"
        echo body()
    }
}