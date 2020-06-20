import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nbOfNotes = scanner.nextInt()

    var d = 0
    var c = 0
    var b = 0
    var a = 0
    repeat(nbOfNotes) {

        when (scanner.nextInt()) {
            2 -> {
                d++
            }
            3 -> {
                c++
            }
            4 -> {
                b++
            }
            else -> {
                a++
            }
        }
    }

    println("$d $c $b $a")
}