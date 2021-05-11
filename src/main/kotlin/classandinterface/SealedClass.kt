package classandinterface

class SealedClass {
}

sealed class Father1 {
    class Son1(val sonName: String) : Father1()
    class Daughter1(val daughterName: String) : Father1()
}

// 이게 더 트랜디한 문법 !
sealed class Father2
class Son2(val sonName: String) : Father2()
class Daughter2(val daughterName: String) : Father2()

fun ggg(family: Father1): Int =
    when (family) {
        is Father1.Son1 -> 1
        is Father1.Daughter1 -> 2
    }

fun gg(family: Father2): Int =
    when (family) {
        is Son2 -> 1
        is Daughter2 -> 2
    }