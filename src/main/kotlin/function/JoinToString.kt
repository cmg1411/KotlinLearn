package function

class JoinToString {
}

fun main() {
    val arrayListOf = arrayListOf("a", "b", "c")

    // 함수 인자로 이름을 붙일 수 있다.
    // 구분하기 쉽다.
    val joinToString = arrayListOf.joinToString(separator = " | ", prefix = "[", postfix = "]")

    println(joinToString)
}