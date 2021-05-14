package lambda.functionalinterface

class Also {}

data class Person(var name: String, var age: Int)

fun main() {
    val person = Person("", 0)
    // also 는 이렇게 쓴는 것이 아니다. 가능은 하지만.
    // 의미상 프로퍼티를 변경하지 않고, 조회하거나 사용하지 않을 때 쓴다.
    // 주로 디버그, 로그 등에 쓴다.
    // 프로퍼티를 변경하고 싶다면, apply 쓰라.
    val result = person.also {
        it.name = "tomas"
        it.age = 27
    }

    println("$person")

    val numbers = mutableListOf("one", "two", "three")
    numbers
        .add("four")
        .also { println("The list elements before adding new one: $it") }
}