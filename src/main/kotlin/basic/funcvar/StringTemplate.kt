package basic.funcvar

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "No Named"
    println(name)

    // java 의 + 연산자 대신 c의 % 처럼 $변수명 을 사용하여 값을 넣을 수 있다.
    println("내 이름은 $name")
    // 복잡한 식은 {} 로 둘러싼다.
    println("내 이름은 ${args[0]}")

    val age = if(args.size > 1) args[1] else "13"
    println("내 나이는 $age")

    // {} 안에서는 식을 넣을 수 있으며, 큰따옴표 역시 넣을 수 있다.
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}")
}