import java.util.*


fun main(args: Array<String>) {

    val s = Scanner(System.`in`)


    print("Enter number of elements in the array: ")
    val size = s.nextInt()


    val doubleArray = DoubleArray(size)


    println("Enter Arrays Elements:")
    for (i in doubleArray.indices) {
        print("doubleArray[$i] : ")
        doubleArray[i] = s.nextDouble()
    }


    var sum: Double=0.toDouble()

    for (i in doubleArray.indices) {
        //add array element in sum
        sum+=doubleArray[i]
    }


    println("Array : ${doubleArray.contentToString()} ")
    println("Sum of Elements : $sum")

}