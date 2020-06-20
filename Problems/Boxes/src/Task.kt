import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input1 = scanner.nextLine()
    val input2 = scanner.nextLine()

    val boxArray1 = input1.split(" ").map { it.toInt() }.sortedDescending()
    val boxArray2 = input2.split(" ").map { it.toInt() }.sortedDescending()

    val x1 = boxArray1[0]
    val y1 = boxArray1[1]
    val z1 = boxArray1[2]

    val vol1 = x1 * y1 * z1

    val x2 = boxArray2[0]
    val y2 = boxArray2[1]
    val z2 = boxArray2[2]

    val vol2 = x2 * y2 * z2

    println(if (x1 >= x2 && y1 >= y2 && z1 >= z2 && vol1 > vol2) {
        "Box 1 > Box 2"
    } else if (x1 <= x2 && y1 <= y2 && z1 <= z2 && vol1 < vol2) {
        "Box 1 < Box 2"
    } else if (x1 == x2 && y1 == y2 && z1 == z2) {
        "Box 1 = Box 2"
    } else {
        "Incomparable"
    })
}
