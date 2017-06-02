package hello

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

import java.time.LocalDate
import java.time.format.DateTimeFormatter;

@SpringBootApplication
class Application {

	private val log = LoggerFactory.getLogger(Application::class.java)

	@Bean
	fun init(repository: CustomerRepository, docRepository: DocumentRepository, menuRepository: MenuRepository) = CommandLineRunner {
		
		    //val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    //val date = "16/08/2016"
		
			//menuRepository.save(Menu(1, null, LocalDate.parse(date, formatter), "Soups" , "Hello, World!"))
		
			// fetch documents by id		
			log.info("Menu found with findOne(1L):")
			log.info("--------------------------------------------")
			val menu = menuRepository.findOne(1L)			
			log.info(menu.toString())			
			log.info("")
		
			//docRepository.save(Document("001","Doc_001", 1, "TypeDoc", 1, 1))
		
			// fetch documents by id		
			log.info("Document found with findOne(1L):")
			log.info("--------------------------------------------")
			val document = docRepository.findOne(1L)			
			log.info(document.toString())			
			log.info("")
		 
		
			// save a couple of customers
			// repository.save(Customer("Jack", "Bauer"))
			// repository.save(Customer("Chloe", "O'Brian"))
			// repository.save(Customer("Kim", "Bauer"))
			// repository.save(Customer("David", "Palmer"))
			// repository.save(Customer("Michelle", "Dessler"))

			// fetch all customers
			log.info("Customers found with findAll():")
			log.info("-------------------------------")
			for (customer in repository.findAll()) {
				log.info(customer.toString())
			}
			log.info("")

			// fetch an individual customer by ID
			val customer = repository.findOne(1L)
			log.info("Customer found with findOne(1L):")
			log.info("--------------------------------")
			log.info(customer.toString())
			log.info("")

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):")
			log.info("--------------------------------------------")
			for (bauer in repository.findByLastName("Bauer")) {
				log.info(bauer.toString())
			}
			log.info("")
	}

}

fun main(args: Array<String>) {
	SpringApplication.run(Application::class.java, *args)
}
