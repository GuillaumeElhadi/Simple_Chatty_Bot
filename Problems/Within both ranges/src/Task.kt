import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()
    val fourth = scanner.nextInt()
    val fifth = scanner.nextInt()

    val range1 = first..second
    val range2 = third..fourth
    println(fifth in range1 && fifth in range2)
}
