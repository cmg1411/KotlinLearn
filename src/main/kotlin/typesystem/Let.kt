package typesystem

/**
 * 널이 될 수 있는 값을 널이 아닌 값만 인자로 받는 함수에 넘기고 싶을 때.
 *
 * let 함수와
 * 1. let
 */

// null 이 아닌 인수를 받는 함수
fun sendEmailTo(email: String) {
    println("sent")
}

fun main() {
    val email = null

    // 불가능 !!
//    sendEmailTo(email)

    email?.let { email -> sendEmailTo(email)}
    email?.let(::sendEmailTo)
    email?.let { sendEmailTo(it) }
}