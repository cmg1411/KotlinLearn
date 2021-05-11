package classandinterface

import javax.xml.crypto.Data

class DataClass {
}

/**
 * data class 는
 *  1. toString()
 *  2. equals()
 *  3. hashCode()
 *  4. copy()
 * 등을 자동으로 생성해준다. (롬복을 쓰지 않는다)
 */
data class DataUser(var Name: String, val age: Int)

fun main() {
    val user = DataUser("Tomas", 27)
    val user2 = DataUser("Tomas", 27)

    println(user.toString())

    // 동일성이 java 와 다름 (equals() 쓰지 않음)
    println(user == user2) // 데이터 동등성
    println(user === user2) // 참조 동일성

    /**
     * equals() 를 오버라이딩하면 동등성을 재정의하나, 여전히 == 로 동등성을 비교
     */
}