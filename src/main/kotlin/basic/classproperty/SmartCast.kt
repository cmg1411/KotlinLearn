package basic.classproperty

import java.lang.Exception
import java.lang.IllegalArgumentException

class SmartCast {
}

interface Expression

class Num(val  value: Int): Expression
class Sum(val left: Expression, val right: Expression): Expression

// java style
fun eval(e: Expression): Int {
    if (e is Num) { // is 는 java 의 instanceOf 와 비슷
        val n = e as Num // java 에서는 instanceOf 로 검사 후 명시적 타입 캐스팅을 해줬음.
        return n.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("정수 또는 연산자만 입력 가능")
}

// Kotlin style
fun eval2(e: Expression): Int {
    if (e is Num) { // is 는 사실 캐스팅을 자동으로 해준다. -> 스마트 캐스팅이라 한다.
        // as 는 명시적 타입 캐스팅에 사용. 여기서는 쓰지 않아도 됨.
        return e.value // e 의 배경에 초록색 칠이 되어 있다. 스마트 캐스팅이 된 것을 알 수 있다.
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("정수 또는 연산자만 입력 가능")
}

// Kotlin style: refactoring if
// 코틀린의 if 는 값을 만들어낸다 -> return 문 생략 가능.
    // 식이 본문인 함수는 블록을 본문으로 가질 수 없다.
    // 블록이 본문인 함수는 내부에 return 문이 꼭 있어야 한다.
// if/else 를 사용하면 식이 하나이므로 중괄호 대신 = 로 표현 가능
fun eval3(e: Expression) =
    if (e is Num) {
        e.value // e 의 배경에 초록색 칠이 되어 있다. 스마트 캐스팅이 된 것을 알 수 있다.
    } else if (e is Sum) {
        eval(e.left) + eval(e.right)
    } else {
        throw IllegalArgumentException("정수 또는 연산자만 입력 가능")
    }

// Kotlin style: refactoring when
// 위의 식을 인텔리제이가 자동으로 리펙토링할 수 있게 해준다.
// when 사용이 더 깔끔 !
fun eval4(e: Expression) =
    when (e) {
        is Num -> e.value // e 의 배경에 초록색 칠이 되어 있다. 스마트 캐스팅이 된 것을 알 수 있다.
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException("정수 또는 연산자만 입력 가능")
    }


fun main() {
    println(eval(Sum(Num(1), Num(2))))
    println(eval2(Sum(Num(1), Num(2))))
    println(eval3(Sum(Num(1), Num(2))))
    println(eval4(Sum(Num(1), Num(2))))
}