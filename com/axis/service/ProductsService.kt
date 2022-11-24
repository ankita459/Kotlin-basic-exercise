package com.axis.service
import com.axis.database.DBOperations
import com.axis.modal.Products

class ProductsService {
    var dbStatement=DBOperations()
    fun addProducts(product:Products):String{
        var str=dbStatement.insert(product)
        return str
    }

    fun deleteProducts(id:Int){

    }

    fun updateProducts(id:Int)
    {

    }
    fun viewProducts()
    {
        var products=dbStatement.view()
        for(product in products){
            println(product)
        }
    }
}