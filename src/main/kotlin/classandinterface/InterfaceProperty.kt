package classandinterface

class InterfaceProperty {}

// 추상 프러퍼티
interface Company {
    val name: String
}

// 추상 프러퍼티를 구현하는 가장 간단한 방법
class Lendit(override val name: String) : Company {
}

// 추상 프러퍼티를 초기화 해두는 방법
class Google(private val _name: String) : Company {
    override val name = _name
}

// 추상 프러퍼티를 get 할 때 마다 어떠한 연산을 해서 가져오는 방법
// 의미없는 비용을 치르는 듯 하지만, 언젠간 유의미하게 쓰일 것 같다.
class Amazon(private val nickname: String) : Company {
    override val name: String
        get() = nickname.substringBefore("#")
}

class HereUser(val name: String) {
    /**
     * 프러퍼티의 필드에 접근할 때에는 field 라는 특별한 식별자를 통해 접근할 수 있다.
     */
    var address: String = "unspecific"
        set(value: String) {
            println("""
                |Address was change from $name
                |"$field" -> "$value"
            """.trimMargin("|"))
            field = value
        }
}

fun main() {
    var user = HereUser("Tomas")
    println(user.address)
    user.address = "NewYork"
    println(user.address)
}