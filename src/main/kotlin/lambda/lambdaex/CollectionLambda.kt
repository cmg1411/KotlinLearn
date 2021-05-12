package lambda

class CollectionLambda {}

data class Person(val name: String, var age: Int)

fun main() {
    val people = listOf(Person("A", 5), Person("B", 44), Person("C", 3))
    // 중괄호는 비교할 때 사용하는 값. (it = people 의 원소 하나.)
    // 코틀린의 람다식은 항상 중괄호로 묶여있다.
    println(
        people.maxByOrNull{ it.age }
    )

    // 메서드 레퍼런스로 변경 가능.
    println(
        people.maxByOrNull(Person::age)
    )
}

