// open 이 붙은 클래스만 상속이 가능.
// () 사이에 선언된 인스턴스 변수는 생성자로 넣어줘야하는 인스턴스 변수
// 그냥 안에 선언된 변수는 생성자로 안넣어도 됨.
// 생성자는 타입을 명시적으로 지정해줘야함. 초기화가 되더라도.
open class Shape(var name:String) {
    var madeBy = "Tomas";
}

// 상속은 :클래스명() 형식으로 클래스 제일 뒤에 붙여줌.
// () 는 생성자.
class Triangle(private var width: Int, private var height: Int): Shape("삼각형") {

    fun getWide(): Int {
        return width * height / 2
    }

    override fun toString(): String {
        return "Triangle(width=$width, height=$height)"
    }
}

fun main() {
    var triangle = Triangle(4, 10)
    println(triangle.toString())
    println("${triangle.name}의 넓이는 ${triangle.getWide()} 입니다.")
    println("제작자는 ${triangle.madeBy} 입니다.")
}