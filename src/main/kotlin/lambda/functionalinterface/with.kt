package lambda.functionalinterface

import java.lang.StringBuilder

// with, apply 는 <수신객체 지정람다> 라고 한다.
// 수신 객체를 명시하지 않고, 람다의 본문 안에서 다른 객체의 메서드를 호출할 수 있게 하는것
class withapply {}

/**
 * result 에 대해 append(), toString() 이라는 여러 메서드를 호출하며 result 를 반복 사용
 */
fun alphabet(): String {
    val result = StringBuilder()
    for (alpha in 'A'..'Z') {
        result.append(alpha)
    }

    result.append("\nNow I know the Alphabet !")
    return result.toString()
}

/**
 * with 는 사실 파라미터가 두개인 함수.
 * 첫번째 파라미터는 수신객체,
 * 두번째 파라미터는 람다식
 */
fun alphabetWith(): String {
//    val result = StringBuilder()
//    return with(result) { // 메서드를 호출하려는 수신 객체를 지정 후 아래 블록에서 반복적으로 사용.
    return with(StringBuilder()) { // 메서드를 호출하려는 수신 객체를 지정 후 아래 블록에서 반복적으로 사용.
        for (alpha in 'A'..'Z') {
            this.append(alpha) // 여기서 this 는 수신객체 result
        }

        append("\nNow I know the Alphabet !") // this 는 생략 가능
        toString()
    }
}

fun main() {
    println(alphabet())
    println(alphabetWith())
}