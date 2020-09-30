package com.microservices.chapter2.service

import com.microservices.chapter2.model.Customer
import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap

@Component
class CustomerServiceImpl : CustomerService {

    companion object {
        val initialCustomer = arrayOf(Customer(1, "Kotlin"),
                Customer(2, "Spring"),
                Customer(3, "Microservices"))
    }

    private val customers = ConcurrentHashMap<Int, Customer>(initialCustomer.associateBy(Customer::id))

    override fun getCustomer(id: Int): Customer? =
        customers[id]


    override fun createCustomer(customer: Customer) {
        customers[customer.id] = customer
    }

    override fun deleteCustomer(id: Int) {
        customers.remove(id)
    }

    override fun updateCustomer(id: Int, customer: Customer) {
        customers.remove(id)
        customers[customer.id] = customer
    }

    override fun searchCustomers(nameFilter: String): List<Customer> =
        customers.filter {
            it.value.name.contains(nameFilter, true)
        }.map(Map.Entry<Int, Customer>::value).toList()

}