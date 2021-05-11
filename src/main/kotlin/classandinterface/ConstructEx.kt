package classandinterface

class ConstructEx {
}

// _ 은 프로퍼티 이름과 구분을 짓기 위해 넣은 문구.
// nickname 으로 받고 this.nickname = nickname 해도 됨.
class User constructor(_nickname: String) {
    val nickname: String
    init {
        nickname = _nickname
    }
}

// 다른 에너테이션이나 가시성 변경자가 없으면 constructor 생략가능
class User2 (_nickname: String) {
    // 초기화 블록도 여기 선언가능.
    val nickname: String = _nickname
}

class User3 (var nickname: String) {
}

/**
 * 모든 생성자에 디폴트값을 주면 파라미터가 없는 기본 생성자를 컴파일러가 자동으로 생성해줌.
 */

fun main() {
    val user1 = User("Tomas")
    val user2 = User2("Tomas")
    val user3 = User3("Tomas")

    println(user1.nickname)
    println(user2.nickname)
    println(user3.nickname)
}