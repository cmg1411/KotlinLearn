package function.extension

class ExtensionFunction {
}

fun String.lastChar(): Char = get(length - 1)

fun main() {
    println("Tomas".lastChar())
}