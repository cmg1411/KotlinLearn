package lambda.lambdaex

class CollectionApi {}

val list = listOf(1, 2, 3, 4)

/**
 * filer, map 은 기능은 java 와 같다 -> list 로 반환.
 */
fun main() {
    list.forEach(::println)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })
}

