package com.mobiledevelopmentfoodapp.dto

//import androidx.room.Entity
//import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class Order(var customerId: Int, var name: String, var products: ArrayList<Food>, var totalPrice: Double, @SerializedName("id") var orderId:Int = 0 ) {
    override fun toString(): String {
        return name
    }
}