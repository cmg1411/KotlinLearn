package typesystem

/**
 * 안전한 null 호출 ?: (엘비스 연산자)
 *
 * ?. 는 null 이면 null 반환.
 * null 대신 디폴트값을 지정하고 싶을 때 ?: 사용가능.
 */
class SafetyNull2 {}

// str 이 null 이면? -> str?.length 는 null 을 반환
// str?.length 가 null 이므로 엘비스 연산자에 의해 0으로 반환
fun safetyLength(str: String?) = str?.length ?: 0
fun safetyLength2(str: String?) = str?.length ?: throw IllegalArgumentException("null 값 불가")

/**
 * 마치 옵셔널의 orElseGet()
 *
 * 뒤의 연산자에 throw 도 쓸 수 있다 -> 마치 java 의 orElseThrow
 */
fun main() {
    var str: String? = null
    println(safetyLength(str))
    println(safetyLength2(str))
}