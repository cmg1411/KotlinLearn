package function.collections

class CollectionExtension {
}

fun main() {
    /**
     * 코틀린의 새로워 보이는 메서드들은 기존 자바 컬렉션의 확장 함수로 구현되었다 !
     */
    val list = arrayListOf("1", "2", "3", "tomas")
    val intList = arrayListOf(6, 1, 2, 3, 4, 5)
    println(list.last())
    // kotlin 1.4 부터 max() 가 deprecate 됨.
    // 대신 maxOrNull() : 원소가 없는 경우 null 반환 메서드를 사용.
    println(intList.maxOrNull())
}