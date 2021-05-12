package typesystem

import lambda.Person

/**
 * as?
 * 변환할 수 없는 타입일 때 null 반환
 */
class SafetyCast {}

class NullPerson(val firstName: String, val secondName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? NullPerson ?: return false

        return this.firstName == otherPerson.firstName &&
                this.secondName == otherPerson.secondName
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + secondName.hashCode()
        return result
    }
}

fun main() {
    val p1 = NullPerson("Kim", "Mingeor")
    val p2 = NullPerson("Kim", "Mingeor")
    val p3 = Person("Kim", 3)

    println(p1 == p2)
    println(p1.equals(p3))
}