package com.axis.app

import com.axis.modal.Products
import com.axis.service.ProductsService

fun main(){
    var productsService=ProductsService()
    var product=Products(3,"HeadSets",3000,5)
    var str=productsService.addProducts(product)
    println(str)
    println("---------Products details--------")
    productsService.viewProducts()
}