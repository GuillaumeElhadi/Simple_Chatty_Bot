import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val m1 = scanner.nextInt()
    val s1 = scanner.nextInt()

    val h2 = scanner.nextInt()
    val m2 = scanner.nextInt()
    val s2 = scanner.nextInt()

    val hr = h2 - h1
    val mr = m2 - m1
    val sr = s2 - s1

    val result = sr + mr * 60 + hr * 3600

    println(result)
}
