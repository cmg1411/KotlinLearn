package lambda

class ConstructorReference {}

data class ReferencePerson(val name: String, var age: Int)

fun ReferencePerson.plusAge(year: Int) { this.age += year }

fun main() {
    // 생성자 참조는 최상위 프러퍼티 참조와 형태가 같다.
    // 클래스를 참조시키면, 해당 클래스의 생성자를 참조시키는 것.
    // 쉽게 말해 해당 클래스의 생성자를 변수에 넣고, 해당 변수를 통해 객체를 생성하는 패턴.
    val createPerson = ::ReferencePerson
    val p = createPerson("tt", 12)
    println(p)

    // 확장함수 레퍼런스
    val aaaa = ReferencePerson::plusAge

    p.plusAge(123)
    aaaa(p, 123)

    println(p)
}