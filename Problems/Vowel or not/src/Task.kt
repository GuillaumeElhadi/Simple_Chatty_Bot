import java.util.Scanner

fun isVowel(letter: Char): Boolean {
    val vowel = arrayOf('a', 'e', 'i', 'o', 'u')
    for(element in vowel) {
        if(element.equals(letter, true)) {
            return true
        }
    }
    return false
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}
