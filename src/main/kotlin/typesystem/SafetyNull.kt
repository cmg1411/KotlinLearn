package typesystem

class SafetyNull {}

/**
 * ?. 는 null 안전한 호출 연산자이다.
 * null 이 아닐때만 뒤의 호출 진행
 * null 이면 뒤의 호출을 진행하지 않고 null 반환.
 */
fun main() {
    val s: String? = null
    println(s?.toUpperCase())

    // s 는 ? 타입이므로 컴파일타임에서 에러가 난다.
    // ? 는 호출때도 안전한 호출을 사용해야한다.
//    println(s.toUpperCase())
}
