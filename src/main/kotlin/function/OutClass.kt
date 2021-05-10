package function

// public static final 과 같음
// const 를 붙이지 않으면 getter 를 통한 접근으로 자바 코드로 노출. 이는 부자연스러움
const val NUMBER = 3

// 최상위 메서드 같은 경우는, 컴파일 타임에 다음과 같은 방식으로 바뀐다.
// 해당 클래스의 이름의 클래스 안의 static 메서드로 감싸지기 때문에, 다른 곳에서 임포트만 하면 접근이 가능하다.
fun outMethod(): String = "Hello"

class OutClass {
}

fun main(args: Array<String>) {
    println("Miles".lastChar())
}
