package lambda.functionalinterface

class LambdaMethodParameter {}

fun postponeComputation(delay: Long, computation: Runnable) {
    computation.run()
    Thread.sleep(delay)
    computation.run()
}

// 람다를 삼수형 인터페이스로 명시적으로 변환하는 로직.
fun createRunnable(): Runnable {
    return Runnable { println("runnable") }
}

fun main() {
    // 함수의 파라미터가 인터페이스이다.
    // 함수의 인자로 람다를 넘기면 함수형 인터페이스이기 때문에 인터페이스로 바꿔준다.
    // 여기서는 Runnable 의 유일한 메서드 run() 의 메서드 본문으로 println("good") 가 들어가는 것이다.
    /**
     * 기본적으로 코틀린의 람다는 무명 클래스와 다르게 매번 똑같은 람다를 반복사용한다.
     * 하지만 주변 변수를 캡쳐하는 경우에는, 변수를 캡쳐한 객체를 새로 만든다.
     */
    postponeComputation(1000) { println("good") }
}