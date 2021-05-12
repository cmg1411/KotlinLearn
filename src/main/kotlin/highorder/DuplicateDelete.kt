package highorder

class DuplicateDelete {
}

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS {
    WINDOWS, MAC, LINUX, UNIX, ANDROID, IOS
}

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 99.0, OS.WINDOWS),
    SiteVisit("/", 14.0, OS.MAC),
    SiteVisit("/", 24.0, OS.MAC),
    SiteVisit("/", 54.0, OS.ANDROID),
    SiteVisit("/", 64.0, OS.UNIX),
    SiteVisit("/", 33.0, OS.IOS)
)

// 만약, WINDOWS, MAC 에 대해 둘 다 알고 싶으면 중복이 생긴다. 그러면 아래 함수와 같은 방법으로 중복을 해결할 수 있다.
val averageWindowsDuration = log.asSequence()
    .filter { it.os == OS.WINDOWS }
    .map(SiteVisit::duration)
    .average()

// 함수로 만든다.
// 가변적인 부분을 인자로 받는다.
fun List<SiteVisit>.averageDuration(os: OS) =
        filter { it.os == os }
        .map(SiteVisit::duration)
        .average()

// 이렇게도 가능하지만, 확장함수를 쓰는게 더 코틀린스러워보인다.
fun averageDuration2(sites: List<SiteVisit>, os: OS) =
    sites.filter { it.os == os }
        .map(SiteVisit::duration)
        .average()

// 람다식을 받을 수도 있다.
// 람다식 자체는 () 로 넣는다. (원래 괄호안에 넣는데, 마지막 인자는 밖으로 뺄 수 있고, 그 인자가 유일하면 괄호를 생략가능해서 위처럼 보였던 것.)
fun List<SiteVisit>.averageDurationDetail(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    println(averageWindowsDuration)

    // 이렇게 재사용 가능.
    println(log.averageDuration(OS.WINDOWS))
    println(log.averageDuration(OS.MAC))
    println(averageDuration2(log, OS.MAC))

    println(log.averageDurationDetail { it.os in setOf(OS.MAC, OS.WINDOWS) })
}