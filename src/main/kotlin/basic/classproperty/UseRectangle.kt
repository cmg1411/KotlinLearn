package basic.classproperty

// 다른 패키지일 시 임포트구문 필요
import basic.classproperty.createRectangle

fun main(args: Array<String>) {
// 같은 패키지 내의 다른 클래스의 자원은 바로 쓸 수 있다.
    println(createRectangle().isSquare)

    /**
     * 현재 Rectangle 의 프로퍼티 width, height 는 private 이므로 접근이 불가.
     * 이후에 private 는 어떻게 접근하는지 알아보자
     */
}