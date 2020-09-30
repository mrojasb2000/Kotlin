package com.microservices.chapter2.controller

import com.microservices.chapter2.model.Customer
import com.microservices.chapter2.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.http.HttpStatus

@RestController
class CustomerController {
    @Autowired
    lateinit var customerService : CustomerService

    @GetMapping(value = ["/customer/{id}"])
    fun getCustomer(@PathVariable id: Int) : ResponseEntity<Customer>? {
        val customer = customerService.getCustomer(id)
        val status = if (customer == null) HttpStatus.NOT_FOUND else HttpStatus.OK
        return   ResponseEntity(customer, status)
    }


    @GetMapping(value = ["/customers"])
    fun getCustomers(@RequestParam(required = false, defaultValue = "") nameFilter: String)
            = customerService.searchCustomers(nameFilter)

    @PostMapping(value = ["/customer/"])
    fun createCustomer(@RequestBody customer: Customer) {
        customerService.createCustomer(customer)
    }

    @DeleteMapping(value = ["/customer/{id}"])
    fun deleteCustomer(@PathVariable id: Int) = customerService.deleteCustomer(id)

    @PutMapping(value = ["/customer/{id}"])
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: Customer){
        customerService.updateCustomer(id, customer)
    }
}