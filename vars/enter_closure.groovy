def call(Map body) {
    echo "111"
    node('master') {
        echo "222"
        for (method in body.methods) {
            sh method
        }

    }
}