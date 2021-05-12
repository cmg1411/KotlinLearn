package operationoverrloading

class DestructingDecl {
}

data class ThirdDimensionPoint(val x: Int, val y: Int, val z: Int) {
}

data class Name(val firstName: String, val secondName: String)

fun splitName(fullName: String): Name {
    val (first, second) = fullName.split(".", limit = 2)
    return Name(first, second)
}

fun main() {
    // 구조 분해 선언
    // 내부적으로 x = p.component1 y = p.component2 이런 식으로 만들어줌.
    val p = ThirdDimensionPoint(1, 2, 3)
    val (x, z) = p
    val (a, b, c) = p

    val splitName = splitName("Tomas.Kim")
    println(splitName)
}