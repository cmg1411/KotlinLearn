package lambda

class MakeLambda {}

val sum = {x: Int, y: Int -> x + y}

fun main() {
    println(sum(1, 2))
    println(sum(5, 3))

    // run 은 인자로 받은 람다 함수를 실행해주는 라이브러리 함수.
    run{ println(43) }
}

fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)