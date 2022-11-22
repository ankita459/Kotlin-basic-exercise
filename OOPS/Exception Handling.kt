package OOPS

import java.util.Scanner

fun main(args: Array<String>)
{

    val sc = Scanner(System.`in`)

    try {

        println("Enter Number 1  : ")
        val num1 = sc.nextInt()

        println("Enter Number 2  : ")
        val num2 = sc.nextInt()

        val div = num1/num2
        println("Result : $div")}

   catch (e: ArithmeticException) {
            println("Number can not be Zero")
        }
    catch (e: Exception) {
        println("Do not enter character")
    }


    }

