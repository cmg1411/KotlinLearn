package operationoverrloading

import java.lang.IllegalArgumentException

class CollectionOperator {}

operator fun Point.get(index: String): Int {
    return when(index) {
        "a" -> x
        "b" -> y
        else ->
            throw IllegalArgumentException()
    }
}

// index 가 먼저 오고, 바꿀 value 가 뒤에 온다.
operator fun Point.set(index: Int, value: Int) {
    when(index) {
        0 -> this.x = value
        1 -> this.y = value
        else ->
            throw IllegalArgumentException()
    }
}

/**
 * 인덱스 연산자를 사용해 원소를 얻는 연산은 get 연산자로 변환된다.
 * 따라서 인덱스 연산자를 오버로딩하고 싶으면 get 메서드를 정의하면 된다 !!!!!!
 * 인덱스 연산자의 파라미터는 Int 가 아니어도 된다 !!
 */
fun main() {
    var p = Point(10, 20)
    println(p)
    println(p["a"])
    println(p["b"])

    p[0] = 5
    println(p)
}