import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val nbOfTour = scanner.nextLine().toInt()
    val intValues = scanner.nextLine().splitToSequence(' ').toMutableList().map { it -> it.toInt() }

    var result = 0
    var precedence = 0
    var tmpResult = 0
    for (i in 0 until nbOfTour) {

        if (intValues[i] >= precedence) {
            precedence = intValues[i]
            tmpResult++
        } else {
            precedence = intValues[i]
            if (tmpResult > result) {
                result = tmpResult
            }
            tmpResult = 1
        }
    }
    println(if (tmpResult > result) tmpResult else result)
}
