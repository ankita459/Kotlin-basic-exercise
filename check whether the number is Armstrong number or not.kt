import java.util.*

fun isArmStrongNo(number: Long): Boolean {
    var isArmNumber = false
    var result : Long= 0
    var original = number


    val digits = original.toString().length

    while (original > 0) {
        val r = original % 10
        result +=Math.pow(r.toDouble(), digits.toDouble()).toLong()
        original /= 10
    }

    if (result == number) {
        isArmNumber = true
    }
    return isArmNumber
}



fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)


    println("Enter Number  : ")
    val num: Long = sc.nextLong()


    if (isArmStrongNo(num))
        println("$num is an Armstrong Number")
    else
        println("$num is not an Armstrong Number")
}