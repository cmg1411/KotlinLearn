package basic.funcvar

import function.extension.lastChar

fun main() {
    // 변수를 선언과 동시에 초기화하지 않는다면 변수타입을 무조건 지정해줘야함.
    // 타입 추론을 할 수 없기 때문.
    val four: Int

    // 컴파일타임에 타입을 추론한다. 따라서 이 변환은 컴파일에러.
//    var num = 5;
//    num = "toto";
    println("Hello Kotlin")
    println(question)
    println(one + two)
    println("one plus two is $three")

    // 다른 패키지에서 확장함수 사용시 임포트
    // 임포트시 as 로 별칭 사용가능 !!
    println("Ian".lastChar())
}

// 변수 선언시 초기화가 같이 이루어졌다면, 변수 타입을 추론할 수 있기 때문에 타입을 생략가능하다.
const val question = "삶과 죽음의 순환은 계속된다."
const val one = 1
const val two: Int = 2
const val three = one + two