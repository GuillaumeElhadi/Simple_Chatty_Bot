import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    val arrayResult: MutableList<Int> = mutableListOf<Int>()

    for (i in 0..1000) {
        val result = a * i.toDouble().pow(3.0) + b * i.toDouble().pow(2.0) + c * i + d
        if (result == 0.0) {
            arrayResult.add(i)
        }
    }
    arrayResult.sort()
    for (element in arrayResult) {
        println(element)
    }
}
