import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var fix = 0
    var perfect = 0
    var rejects = 0
    repeat(n) {
        when (scanner.nextInt()) {
            1 -> fix++
            -1 -> rejects++
            0 -> perfect++
        }
    }
    println("$perfect $fix $rejects")
}
