package ilya

// point in 3D space
class Cube {

    public count_v(x, y, z){
        x = x.toInteger()
        y = y.toInteger()
        z = z.toInteger()
        return x * y * z
    }
}