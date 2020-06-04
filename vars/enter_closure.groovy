def call(Map body) {

    echo "111"
    node('master') {
        echo "222"
        sh body.methods
    }
}