package function

class ExtendedMethodCantOverride {
}

open class View {
    open fun press() = println("View Clicked ! ")
}

class Button: View() {
    override fun press() = println("Button Clicked ! ")
}

fun main(args: Array<String>) {
    fun View.delete() = println("Delete View")
    fun Button.delete() = println("Delete Button")

    val view1 = Button()
    val view2: View = Button()
    view1.press()
    view2.press()

    // 확장된 메서드는 정적인 타이밍에 메서드가 결정된다.
    // view1 은 타입을 지정하지 않았으므로, 정적인 타이밍에 Button 으로 초기화된다.
    view1.delete()
    // 하지만 view2 는 타입을 View 로 지정했다. 따라서 정적인 타이밍에 view2 는 View 타입이므로 View 의 delete 가 실행된다.
    // --> 확장 함수는 오버라이딩 할 수 없다.
    // 확장 함수는 클래스의 일부가 아니고, 클래스 밖에 선언되기 때문.
    view2.delete()
}