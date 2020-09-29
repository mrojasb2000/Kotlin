package com.microservices.chapter2

import com.microservices.chapter2.model.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import java.util.concurrent.ConcurrentHashMap

@SpringBootApplication
class Chapter2Application {
	@Bean
	@ConditionalOnExpression("#{'\${service.type}'=='advance'}")
	fun advanceService() : ServiceInterface = AdvanceService()

	@Bean
	@ConditionalOnExpression("#{'\${service.type}'=='simple'}")
	fun exampleService() : ServiceInterface = ExampleService()

	companion object {
		val initialCustomer = arrayOf(Customer(1, "Kotlin"),
				Customer(2, "Spring"),
				Customer(3, "Microservices"))
	}

	@Bean
	fun customer() = ConcurrentHashMap<Int, Customer>(initialCustomer.associateBy(Customer::id))
}

@Controller
class FirstController() {
	@Autowired
	lateinit var myService: ServiceInterface
	@RequestMapping(value = ["/user/{name}"], method = [RequestMethod.GET])
	@ResponseBody
	fun hello(@PathVariable name: String) = myService.getHello(name)
}

fun main(args: Array<String>) {
	runApplication<Chapter2Application>(*args)

}
