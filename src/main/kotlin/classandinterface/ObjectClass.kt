package classandinterface

import java.io.File

class ObjectClass {}

// object 는 객체 선언이라고 한다.
// 클래스를 정의하고, 클래스의 인스턴스를 만들고, 인스턴스를 변수에 저장하는 것을 한줄에 해결한다.
// 생성자는 객체 선언에 쓸 수 없다. (주 생성자처럼)
object CaseInsensitiveFileComparator: Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

fun main() {
    // 변수처럼 사용. 아니, 변수이다.
    // 싱글톤으로 세 참조값이 같다.
    println(CaseInsensitiveFileComparator)
    println(CaseInsensitiveFileComparator)
    println(CaseInsensitiveFileComparator)
}