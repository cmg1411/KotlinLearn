package operationoverrloading

class OperatorOverloading {}

data class Point(var x: Int, var y: Int) {
    operator fun plus(other: Point): Point {
        return Point(this.x + other.x, this.y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(this.x - other.x, this.y - other.y)
    }
}

operator fun Point.times(other: Point) =
    Point(this.x * other.x, this.y * other.y)

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)

    println(p1 + p2)
    println(p1 - p2)
    println(p1 * p2)
}