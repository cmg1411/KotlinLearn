package lambda.lambdaex

import lambda.Person

class LazyCalculation {}

fun main() {
    people.map(Person::name).filter { it.startsWith("A") }

    // sequence (java 의 stream 과 같음)
    // 지연 연산을 사용하기 때문에 종단 연산이 오기 전까지 연산을 하지 않는 이점.
    // 차이점은 병렬스트림(parallelStream 이 시퀀스에는 없다)
    val toList = people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()

    for (s in toList) {
        println(s)
    }

    // generateSequence 로도 시퀀스를 만들 수 있따.
    val sum = generateSequence(0) { it + 1 }
        .takeWhile { it <= 100 }
        .sum()

    println(sum)
    println(sum)
}