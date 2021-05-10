package function

class ExtendedProperties {
}

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length-1, value)
    }

fun main(args: Array<String>) {
    val sb = StringBuilder()
    sb.append("Tomas")
    println(sb.lastChar)
    sb.lastChar = 'k'
    println(sb.lastChar)
}