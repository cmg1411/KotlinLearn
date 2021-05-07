package basic.classproperty

enum class Color(
    var r: Int, var g: Int, var b: Int
) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255)
}

fun main() {
    println(Color.RED.r)
    println(Color.BLUE.b)
    println(Color.GREEN.g)
}