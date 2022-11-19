fun main() {

    //Without temporary variable

    var number1 = 10
    var number2 = 20
    println("Numbers Before Swap : \n number1 = $number1 \n number2 = $number2 ")
    var temp = number1
    number1=number2
    number2=temp
    println("Numbers After  Swap : \n number1 = $number1 \n number2 = $number2 ")

}