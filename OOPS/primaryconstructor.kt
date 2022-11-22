package OOPS
import java.util.Scanner

fun main(args: Array<String>)
{
    val sc = Scanner(System.`in`)
    println("Enter Number 1  : ")
    val num1= sc.nextInt()

    println("Enter Number 2  : ")
    val num2= sc.nextInt()

    var calc=Calculation(num1,num2)
    println("Choose you choice\n 1.Add\n2.Substract\n3.Multiplication\n4.Division")

    var choice=sc.nextInt()
    when(choice){1->calc.Add()2->calc.Substract()3->calc.Multiply()4->calc.Division()else->
        println("Choose correct choice")
    }
}
class Calculation(num1:Int,num2:Int){
    var num1:Int=num1
    var num2:Int=num2//add
fun Add(){
    println("$num1 + $num2 = ${num1+num2}")}
//substract
fun Substract(){
    println("$num1 -$num2 = ${num1-num2}")}//multiply
fun Multiply(){
    println("$num1 * $num2 = ${num1*num2}")}//divide
fun Division(){
    println("$num1 / $num2 = ${num1/num2}")
}
}

