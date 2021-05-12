package lambda.functionalinterface

import java.lang.StringBuilder

/**
 * with 과 거의 비슷, 하지만
 * with 은 람다의 결과를 반환, 함수로 정의
 * apply 는 수신 객체를 반환, 수신객체의 확장함수로 정의, 수신 객체를 반환
 */
class Apply {}

fun alphabet3() =
    StringBuilder().apply {
        for (c in 'A'..'Z') {
            append(c)
        }
        append("\nNow I Know the Alphabet !")
    }

// apply 를 사용한 코틀린의 라이브러리 함수
fun alphabet4() = buildString {
        for (c in 'A'..'Z') {
            append(c)
        }
        append("\nNow I Know the Alphabet !")
    }


fun main() {
    println(alphabet3().toString())
    println(alphabet4().toString())
}