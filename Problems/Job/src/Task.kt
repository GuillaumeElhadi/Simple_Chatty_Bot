import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val range = 18..59
    val input = scanner.nextInt()
    
    println(input in range)
}
