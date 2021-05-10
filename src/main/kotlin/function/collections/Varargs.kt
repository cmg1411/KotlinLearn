package function.collections

class Varargs {
}

// 가변인자는 java 의 .. 대신 vararg 라는 키워드를 쓴다.
fun showAllElement(vararg elements: Int) {
    for (element in elements)
        println(element)
}

fun main() {
    showAllElement(1, 2, 3, 4)
    showAllElement(5, 6)

    var firstList = arrayOf(1, 2, 3, 4, 5)
    // 스프레드 연산자는 이미 정의된 배열을 (리스트 x) 가변인자로 넣을때 쫙 펼쳐주는 역할을 한다.
    var secondList = listOf("args : ", *firstList)
    println(secondList)
}