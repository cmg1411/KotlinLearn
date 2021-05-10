package basic.classproperty

import java.util.*

class Iteration {
}

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> "$i"
    }

fun main() {
    // 순방향 수열은 ..
    // 끝 수 (100) 포함
    for (i in 1..100)
        println(fizzBuzz(i))

    // 100 포함하지 않음
    for (i in 1 until 100) {
        println(fizzBuzz(i))
    }

    // 역방향 수열은 downTo
    for (i in 100 downTo 1 step 2)
        println(i)

    val treeMap = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val toBinaryString = Integer.toBinaryString(c.toInt())
        // put 메서드 대신 이렇게 씀, 인덱스처럼 접근 가능
        treeMap[c] = toBinaryString
    }

    // Map 을 이렇게 괄호로 받을 수 있다.
    for ((letter, binary) in treeMap) {
        println("$letter = $binary")
    }

    val arrayListOf = arrayListOf("10", "100", "1000")

    // .withIndex() 는 인덱스와 값을 같이 이터레이션 할 수 있도록 한다.
    for ((index, element) in arrayListOf.withIndex()) {
        println("$index = $element")
    }
}