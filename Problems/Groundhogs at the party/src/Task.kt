import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val reese = scanner.nextInt()
    val weekend = scanner.nextBoolean()

    if (!weekend) {
        println(reese in 10..20)
    } else {
        println(reese in 15..25)
    }
}