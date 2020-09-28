package com.microservices.chapter2

import org.springframework.stereotype.Service

interface ServiceInterface {
    fun getHello(name: String) : String
}

@Service
class ExampleService: ServiceInterface {
    override fun getHello(name: String) = "Hello $name"
}
