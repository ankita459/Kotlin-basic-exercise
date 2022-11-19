import java.util.*

fun main() {
    var reader = Scanner(System.`in`)
    println("Enter Year : ")
    var year = reader.nextInt();
    val isleap = if (year % 4 == 0){
        if (year % 100 == 0) {
            year % 400 == 0
        } else true
    } else false;

    println("$year is ${if (isleap) "Leap Year" else "Not a Leap Year"} ")
}

