package basic.funcvar

/**
 * 기본적으로 val (불변) 을 사용하자 !
 */
fun main() {
    val immutable = 3
    var mutable = 5

    // val -> value -> 불변 (java 의 final 변수) (아래는 불가)
//    immutable = 10

    // var -> variable -> 가변
    mutable = 10
}