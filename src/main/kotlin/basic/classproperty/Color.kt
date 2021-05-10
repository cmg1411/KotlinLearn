package basic.classproperty

import basic.classproperty.Color.*
import basic.classproperty.Week.*
import java.lang.IllegalArgumentException

enum class Color(
    var r: Int, var g: Int, var b: Int
) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    GREEN(0, 255, 0), YELLOW(255, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + b) * 256 + b
}

enum class Week(
    val weekOrdinal: Int, val weekName: String
) {
    SUNDAY(1, "일요일"),
    MONDAY(2, "월요일"),
    TUESDAY(3, "화요일"),
    WEDNESDAY(4, "수요일"),
    THURSDAY(5, "목요일"),
    FRIDAY(6, "금요일"),
    // 여기 메서드와 나눠지는 부분에서는 코틀린에서 유일하게 세미콜론을 쓴다 !!
    SATURDAY(7, "토요일");

    fun getWeek() = weekName + "입니다."
}

fun getWeekOrdinal(week :Week): Int =
    when (week) {
        MONDAY -> MONDAY.weekOrdinal
        SUNDAY -> SUNDAY.weekOrdinal
        TUESDAY -> TUESDAY.weekOrdinal
        WEDNESDAY -> WEDNESDAY.weekOrdinal
        THURSDAY -> THURSDAY.weekOrdinal
        FRIDAY -> FRIDAY.weekOrdinal
        SATURDAY -> SATURDAY.weekOrdinal
    }

fun getWeekend(week: Week) =
    when (week) {
        // 이렇게 연결해서 쓸 수 있다.
        SUNDAY, SATURDAY -> "주말 !!"
        else -> "주말이 아닌 무언가"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf<Color>(c1, c2)) {
        setOf(YELLOW, RED) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(VIOLET, BLUE) -> INDIGO
        else -> throw IllegalArgumentException("해당 조합으로 만들 수 있는 색이 없습니다.")
    }

fun main() {
    println(RED.r)
    println(BLUE.b)
    println(GREEN.g)

    println(MONDAY.getWeek())

    println(getWeekOrdinal(SATURDAY))
    println(getWeekend(SATURDAY))
    println(getWeekend(SUNDAY))
    println(getWeekend(MONDAY))

    // setOf() 는 순서를 생각하지 않는 set 으로 만들기 때문에 어떤 조합이든 비교 가능
    // 코틀린의 when 절은 java 의 case 와 다르게 식이 조건 검사 문에 올 수 있음.
    println(mix(RED, YELLOW)) // 오렌지
    println(mix(BLUE, VIOLET)) // 인디고
    println(mix(RED, RED)) // 없음
}