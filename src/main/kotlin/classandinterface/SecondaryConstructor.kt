package classandinterface

import javax.naming.Context

/**
 * 클래스 뒤의 괄호에 들어가서 초기화하고 디폴트 값을 주는 생성자를 주생성자라 한다.
 * 클래스 내부에서 constructor() 를 이용하여 만드는 생성자를 부 생성자라 한다.
 * 부 생성자는 여러개 만들 수 있다.
 *
 * 클래스에 주 생성자가 없다면, 모든 부 생성자는 다른 부 생성자나 상위 클래스의 생성자에게 생성을 위임해야한다.
 * 클래스에 주 생성자가 있다면, 위의 경우를 택하거나, 자신의 주 생성자에게 생성을 위임한다.
 */
class SecondaryConstructor {}

open class MasterButton() {}

class MyButton(val a: String, val b: String, val c: String): MasterButton() {

    // 아래 생성자에게 위임
    constructor(a: String): this(a, "kk")

    // 주 생성자에게 위임
    constructor(a: String, b: String): this(a, b, "qq")
}

fun main() {
    val my = MyButton("tomas")
    println(my.a)
    println(my.b)
    println(my.c)
}