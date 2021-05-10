package function

class Collection {
}

fun main() {
    val hashMapOf = hashMapOf("1" to "one", "2" to "two")
    // javaClass 는 java 의 getClass() 와 같다.
    // javaClass 이름에서 알 수 있듯이, kotlin 만의 기능이 아니라 java 의 컬렉션을 가져다 씀을 알 수 있다.
    println(hashMapOf.javaClass)
}