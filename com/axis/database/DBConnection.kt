package com.axis.database

import java.sql.Connection
import java.sql.DriverManager

class DBConnection {
    fun connect(): Connection {
        val myurl="jdbc:mysql://localhost:3307/kotlindb"//localhost is the database name
        val connection= DriverManager.getConnection(myurl,"root","2018HC0134")
        return connection
    }
}