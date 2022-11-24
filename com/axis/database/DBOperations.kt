package com.axis.database
import com.axis.modal.Products

class DBOperations {
    var dbConnection = DBConnection()
    var connection = dbConnection.connect()


    fun insert(product: Products): String {
        //var id=product.id
        //var name=product.name
        //var price=product.price
        //var noofItems=product.noofItems
        var stmt = connection.prepareStatement("insert into products values(?,?,?,?)")
        stmt.setInt(1, product.id)
        stmt.setString(2, product.name)
        stmt.setInt(3, product.price)
        stmt.setInt(4, product.noofItems)

        var result = stmt.executeUpdate()
        if (result > 0) {
            return "Record inserted"
        } else {
            return "Insertion failed"
        }

    }

    fun view(): MutableList<Products> {

        val prestmt = connection.prepareStatement("select * from products")

        val result = prestmt.executeQuery()
        val products = mutableListOf<Products>()

        while (result.next()) {
            val id = result.getInt("id")
            val name = result.getString("name")
            val price = result.getInt("price")
            val noofItems = result.getInt("noofItems")

            products.add(Products(id, name, price, noofItems))
        }
        return products

    }


}