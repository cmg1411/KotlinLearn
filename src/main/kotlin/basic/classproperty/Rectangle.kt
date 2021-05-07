package basic.classproperty

import java.util.Random

class Rectangle(private val height: Int, private val width: Int) {
    // 이렇게 한줄로도 작성이 가능.
    val isSquare: Boolean
        get() = height == width

    // 이렇게 블록으로도 작성이 가능. but 위의 방법이 더 말끔해보인다.
    val isSquare2: Boolean
        get() {
            return height == width
        }
}

fun createRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(50), random.nextInt(50))
}

fun main() {
    val rectangle = Rectangle(3, 4)
    // 메서드 호출은 자바의 필드 호출처럼 호출한다. (자바의 메서드 호출처럼 ()을 쓰지 않음)
    println(rectangle.isSquare)
    println(rectangle.isSquare2)
}