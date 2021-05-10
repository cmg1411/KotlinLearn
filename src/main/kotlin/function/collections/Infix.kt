package function.collections

class Infix {
}

fun main() {
    // to 는 중위 호출 함수이다.
    // 중위 호출은 수신 객체와 유일한 메서드 인자 사이에 메서드 이름을 넣는다.
    // 1 to "One" 은 1.to("One") 과 같다. (중위 호출은 괄호를 안쓴다는 이야기, 대신 띄워쓰기는 해야함.)
    // Any 는 java 의 Object 와 비슷.
    // to 를 이용한 구조분해선언
    val list = listOf("가", "나", "다")
    val mapOf: Map<Any, Any> = mapOf(1 to "One", "2" to "Two", list to list.size)
    val mapOf2 = mapOf(1 to2 "One", "2".to2("Two"))

    // 구조 분해 선언을 이용한 값 추출
    for ((key, value) in mapOf) {
        println("$key, $value")
    }

    // 이 역시 인덱스를 이용한 구조 분해 선언 및 사용.
    for ((index, element) in list.withIndex()) {
        println("$index, $element")
    }
}

// 중위 호출 만드는 법 : infix 붙이기
infix fun Any.to2(other: Any) = Pair(this, other)

/**
 * 이를 구조분해 선언이라고 한다.
 * to 함수도 앞 뒤의 중위 호출 인자들을 가지고 합쳤다가, 다시 때어낼 수 있다.
 * 구조를 알아서 분해하여 코드가 동작한다.
 */
