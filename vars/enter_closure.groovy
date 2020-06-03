def call(Closure params) {
    node('master') {
        echo "${params}"
    }
}