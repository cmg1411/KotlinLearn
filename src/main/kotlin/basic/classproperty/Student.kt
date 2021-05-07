package basic.classproperty

/**
 * java 의 getter, setter 를 이용하여 접근하였다.
 *
 * 하지만 Kotlin 에서는 var, val 로 구분할 수 있다.
 * val : read Only 이므로 getter 만 있는 효과
 * var : read, write 이므로 getter, setter 둘 다 있는 효과
 */
class Student(val name: String) {
    var age = 0
}

fun main() {
    val student = Student("kim")
    student.age = 13

    println("이름 ${student.name}")
    println("나이 ${student.age}")
}