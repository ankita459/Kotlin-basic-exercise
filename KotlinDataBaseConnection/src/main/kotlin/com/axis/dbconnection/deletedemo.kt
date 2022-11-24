package com.axis.dbconnection

import java.sql.DriverManager

data class User3(val id:Int, val name:String)

fun main(args:Array<String>) {
    val myurl = "jdbc:mysql://localhost:3307/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "2018HC0134")
    println("connection establish successfully")

    val stmt = connection.createStatement()
    val delete_res=stmt.executeUpdate("delete from users where id = 1")
    if( delete_res > 0){println("successfully deleted record in users db !!!")
        println("$delete_res rows deleted")} else{println("Deletion failed")}
}