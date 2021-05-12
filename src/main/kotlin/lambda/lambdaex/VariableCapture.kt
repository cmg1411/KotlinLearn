package lambda.lambdaex

class VariableCapture {}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    // 람다 안에서 람다 밖의 clientErrors, serverErrors 에 접근하는 모습
    // final 이 아니어도 접근이 가능하며, 변경도 가능하다 !!
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

/**
 * 주의 할 점은, 외부 로컬 변수를 사용하는 식이 비동기적으로 실행된다면, 변화가 바로바로 적용된다고 보장할 수 없다.
 */

fun main() {
    val responses = listOf("200 Ok", "400 Error", "404 Error", "500 Error", "501 Error")
    printProblemCounts(responses)
}