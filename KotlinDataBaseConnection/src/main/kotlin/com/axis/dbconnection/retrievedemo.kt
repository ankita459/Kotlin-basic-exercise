package com.axis.dbconnection

import java.sql.DriverManager

data class Users(val id:Int, val name:String)

fun main(args:Array<String>) {
    val myurl = "jdbc:mysql://localhost:3307/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "2018HC0134")
    println("connection establish successfully")

    val query = connection.prepareStatement("select * from users")
    val result = query.executeQuery()
    val users = mutableListOf<User>()
    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    for (user in users){
        println(users)
    }

}
