import java.util.Scanner
fun main() {
    var k:Int;
    var inputArray: IntArray =IntArray(5);
    val integer = Scanner(System.`in`)
    for( k in 0..4)
    {

        print("Enter an integer: ")
        var enteredinteger:Int = integer.nextInt()
        inputArray[k]=enteredinteger
    }

    var largestElement = inputArray[0]

    for (n in inputArray) {
        if (largestElement < n)
            largestElement = n
    }

    println("The largest element in the array is %d".format(largestElement))
}