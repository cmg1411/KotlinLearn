package typesystem

class NullableType {}

// 파라미터 s 는 항상 String 의 인스턴스여야 한다는 뜻이 숨어있다.
fun strLength(s: String) = s.length
// ? 가 붙은 타입은 해당 변수에 null 이 들어갈 수 있다는 말이다.
fun nullableStrLength(s: String?) = if (s == null) "null!!!!" else s
// 안전한 호출 연산자 ? -> s 가 null 이 아니라면 ? 가 없는 것 처럼 동작하지만, null 이라면 null 을 반환한다. 따라서 반환 타입도 ? 가 붙어있다.
fun nullableStrLength2(s: String?): Int?  = s?.length

fun main() {
    var nullProperty = null
    var notNullString = "tomas"

    // 아래는 에러
//    println(strLength(nullProperty))

    println(notNullString)
    println(nullableStrLength(nullProperty))
}