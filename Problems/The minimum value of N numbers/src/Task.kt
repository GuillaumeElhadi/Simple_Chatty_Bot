import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val nbOfTour = scanner.nextLine()
    val values = scanner.nextLine()
    var result = 0

    for (i in 0 until nbOfTour.toInt()) {
        val intValues = values.split(" ").map { it -> it.toInt() }
        if (i == 0) {
            result = intValues[i]
        } else if (intValues[i] < result) {
            result = intValues[i]
        }
    }
    println(result)
}