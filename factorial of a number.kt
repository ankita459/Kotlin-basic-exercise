import java.util.*
fun main() {
    var reader = Scanner(System.`in`)
    println("Enter Number : ")
    var number = reader.nextInt()
    var factorial: Long=1

    for(i in 1..number){
        factorial*=i.toLong()
    }
    println("Factorial of $number is $factorial ")
    }
