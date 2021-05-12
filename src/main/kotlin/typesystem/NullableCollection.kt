package typesystem

class NullableCollection {}

fun addValidNumbers(numbers: List<Int?>) {
    // filterNotNull() -> collection 의 확장함수 : 리스트중 널이 아닌 것 만 뽑는다.
    val validNumbers = numbers.filterNotNull()
    val sum = validNumbers.sum()
    println("$sum")
}

fun main() {
    val numberList = listOf(null, 1, 2, 3, null)
    println(addValidNumbers(numberList))
}