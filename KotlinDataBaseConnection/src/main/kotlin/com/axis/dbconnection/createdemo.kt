package com.axis.dbconnection

import java.sql.DriverManager

data class User1(val id:Int, val name:String)

fun main(args:Array<String>) {
    val myurl = "jdbc:mysql://localhost:3307/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "2018HC0134")
    println("connection establish successfully")

    val stmt= connection.createStatement()
    stmt.execute("create table product(id int,name varchar(45));")
    print("table created")
}