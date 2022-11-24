package com.axis.dbconnection

import java.sql.DriverManager

data class User(val id:Int, val name:String)

fun main(args:Array<String>) {
    val myurl = "jdbc:mysql://localhost:3307/kotlindb"
    val connection=DriverManager.getConnection(myurl,"root","2018HC0134")
    println("connection establish successfully")

    val stmt = connection.createStatement()
        val res=stmt.executeUpdate("insert into users values(10,'Kabir')")
    if (res > 0)
    {
        println("successfully inserted record into users db !!!")}
    else {
        println("Insert Not sucessful")
    }
}

