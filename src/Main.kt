val kotlin: String = "kotlin" // Top-level variable. [K.M]
var greeting: String? = "Hello"  // Mutable Top-Level Nullable Variable

fun main() {
    println("Hello Kotlin")
    // var - mutable variables
    // val - local read only variables - value can be assigned only once.
    val name: String = "AkSaCh" // local variable - available only within the main function
    println(greeting)
    println(name)

    greeting = "Hi"
    println(greeting)
    println(kotlin)

    greeting = null
    println(greeting)
    // Variable declaration
    // var/val/const varName: Type = varValue
    // N: Types in Kotlin are non-null by default. So there is a difference between a Nullable String and a Non-Nullable string
    // N: Kotlin supports type inferences on Variables and properties
}