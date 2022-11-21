import java.util.*


fun main(args: Array<String>) {

    val s = Scanner(System.`in`)


    print("Enter number of elements in the array: ")
    val size = s.nextInt()


    val intArray = IntArray(size)


    println("Enter Arrays Elements:")
    for (i in intArray.indices) {
        print("intArray[$i] : ")
        intArray[i] = s.nextInt()
    }



    var minimum = intArray.min()


    println("Array : ${intArray.contentToString()} ")


    println("Minimum Element of Array is : $minimum")
}