val name: String = "Mavro"
var greeting: String? = null

fun main(args: Array<String>) {
    greeting = "Hello"
    when (greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }
    println("Hello World! " + name)
}
