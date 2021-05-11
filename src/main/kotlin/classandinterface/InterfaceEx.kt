package classandinterface

class InterfaceEx {
}

/**
 * 코틀린의 인터페이스는 구현을 가진 메서드 작성 가능. (자바의 디폴트 메서드)
 * 다중 구현도 가능
 * 반면에 프로퍼티는 가질 수 없음.
 */
interface Car {
    fun drive()
    fun oiling() = println("주유합니다.")
}

interface 탈것 {
    fun oiling() = println("주유합니다??????")
}

class Genesis(val name: String): Car, 탈것 {
    override fun drive() {
        println("제네시스 운전중 !")
    }

    // 다중 구현에서 같은 메서드가 있으면 기본적으로 컴파일 에러.
    // super 키워드에 제네릭 형식으로 어떤 클래스의 메서드를 사용할지        지정해 줄 수 있다.
    override fun oiling() {
        super<Car>.oiling()
        super<탈것>.oiling()
    }
}

fun main() {
    var genesis = Genesis("제네시스")
    genesis.drive()
    genesis.oiling()
}