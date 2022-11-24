package com.axis.dbconnection

import java.sql.DriverManager

data class User4(val id:Int, val name:String)

fun main(args:Array<String>) {
    val myurl = "jdbc:mysql://localhost:3307/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "2018HC0134")
    println("connection establish successfully")

    val prestmt=connection.prepareStatement("insert into users values(?,?)")
    prestmt.setInt(1,11)
    prestmt.setString(2,"bala")
    val result=prestmt.executeUpdate()
    if(result>0){println("inserted")}
    else{println("not inserted")}
}