import java.util.*

fun isPalindrome(number: Int): Boolean {

        var isPalindromeNumber = false
        var sum = 0
        var tempNum = number

        while (tempNum > 0) {
            val r = tempNum % 10
            sum = sum * 10 + r
            tempNum /= 10
        }
        if (sum == number) {
            isPalindromeNumber = true
        }
        return isPalindromeNumber
    }

    fun main(arg: Array<String>) {
        val sc = Scanner(System.`in`)


        println("Enter Number  : ")
        val num: Int = sc.nextInt()


        if (isPalindrome(num))
            println("$num is a Palindrome Number")
        else
            println("$num is not a Palindrome Number")

    }
