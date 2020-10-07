package com.microservices.chapter2.model

data class Customer(var id: Int = 0, var name : String = "", var telephone: Telephone) {
    data class Telephone(var countryCode: String = "", var telephoneNumber: String = "")
}