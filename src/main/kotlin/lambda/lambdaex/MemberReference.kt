package lambda.lambdaex

import lambda.Person

class MemberReference {}

// 최상위 프로퍼티
fun topFunction() = println("최상위 프로퍼티")

// java 와 달리, 메서드 레퍼런스 뿐 만 아니라, 변수의 레퍼런스도 가능 !!!
val getAge = Person::age
val getAge2 = { person: Person -> person.age }

fun main() {
    // 아래 세개는 모두 같음
    people.maxByOrNull { p -> p.age }
    people.maxByOrNull { it.age }
    people.maxByOrNull(Person::age)

    // 최상위 프로퍼티도 참조 가능
    // :: 앞을 비운다 !!!
    run(::topFunction)
}