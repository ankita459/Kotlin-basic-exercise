package MutableList

fun main(args: Array<String>){
    var javabatch = mutableListOf("Anil","Gopal","Ankit","Manish")
    var kotlinbatch = mutableListOf("Ankit","Kumar","Manish","Rahul")

var result = javabatch.plus(kotlinbatch)
    println(result)

    val distinct = result.distinct().toMutableList()
    println(distinct)

    distinct.sort()
    println(distinct)

}
