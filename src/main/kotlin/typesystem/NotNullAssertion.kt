package typesystem

fun ignoreNull(s: String?) {
    // !! 는 null 이 아니라고 단언함.
    // 따라서, 타입을 넣을때 nullable 이라도 Null 불가로 들어감.
    // 이후 NPE 가 발생 가능.
    val sNotNull = s!!
    println(sNotNull.length)
}

fun main() {
    val nullStr = null
    val notNullStr = "abc"

    println(ignoreNull(notNullStr))
    println(ignoreNull(nullStr))
}