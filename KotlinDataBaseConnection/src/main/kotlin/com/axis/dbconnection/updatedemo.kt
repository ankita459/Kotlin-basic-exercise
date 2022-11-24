package com.axis.dbconnection

import java.sql.DriverManager

data class User2(val id:Int, val name:String)

fun main(args:Array<String>) {
    val myurl = "jdbc:mysql://localhost:3307/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "2018HC0134")
    println("connection establish successfully")

    val update_res = connection.createStatement().executeUpdate("update users set name = 'Rahul' where id = 10")
    if( update_res > 0){
        println("successfully updated record in users db !!!")}
    else{
        println("Update Not sucessful")}
}