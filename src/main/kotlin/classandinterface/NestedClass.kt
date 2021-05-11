package classandinterface

import java.io.Serializable

class NestedClass {
}

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State){}
}

class Button: View {
    override fun getCurrentState(): State = ButtonState()

    /**
     * 중첩 클래스에 아무것도 붙지 않으면 자바의 static 중첩 클래스와 같다.
     * static 중첩 클래스는 바깥 클래스의 참조(this)를 가지지 않는다.
     * 즉, 코틀린의 기본 중첩 클래스는 바깥 클래스의 참조를 명시적으로 가지지 않는 한 기본적으로는 가지지 않는다.
     * 이로 인한 이점을 누릴 수 있다. (이펙티브 자바에서도 나온 내용.)
     */
    class ButtonState: State {
    }

    /**
     * 바깥 참조를 가지게 하고 싶다면 inner 를 사용하면 된다.
     * inner 안에서 바깥 참조를 사용하려면 this@{바깥클래스이름} 을 사용하자.
     */
    inner class ButtonState2: State {
        fun getOuterClass() = this@Button
    }
}