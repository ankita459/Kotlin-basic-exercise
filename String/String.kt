package String

fun main(args: Array<String>) {
    var str ="Java Programming"
    val i =10
    val str1 = "abc"
    val str2 = "Hello, World!"
    val salary: Int = 30000
    val b = 5


    println(str[0])
    println(str[1])
    println(str[str.length-1])
    println("i = $i")
    println("$str1 is a string which length is ${str.length}")
    val myString = """value $salary is greater than value $b.""".trimMargin()
    println("${myString.trimMargin()}")
    println(str1==str2)
    println(str1!=str2)
    println(str1===str2)
    println(str1!==str2)
}