package basic.classproperty

// 생성자는 클래스 선언 옆에 () 로 작성한다.
// Kotlin 의 기본 접근 제어자는 public 이므로 public 을 생략가능하다.
class Person(val name:String) {
}

fun main() {
    var tomas = Person("Tomas")
    println(tomas.name)
}