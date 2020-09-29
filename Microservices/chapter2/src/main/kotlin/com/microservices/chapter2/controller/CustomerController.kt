package com.microservices.chapter2.controller

import com.microservices.chapter2.model.Customer
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {
    @RequestMapping(value = ["/customer"], method = [RequestMethod.GET])
    fun getCustomer() = Customer(1, "Kotlin")
}