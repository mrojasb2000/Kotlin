package com.microservices.chapter2.controller

import com.microservices.chapter2.model.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ConcurrentHashMap

@RestController
class CustomerController {
    @Autowired
    lateinit var customers : ConcurrentHashMap<Int, Customer>

    @RequestMapping(value = ["/customer/{id}"], method = [RequestMethod.GET])
    fun getCustomer(@PathVariable id: Int) = customers[id]

    @RequestMapping(value = ["/customers"], method = [RequestMethod.GET])
    fun getCustomers() = customers.map(Map.Entry<Int, Customer>::value).toList()
}