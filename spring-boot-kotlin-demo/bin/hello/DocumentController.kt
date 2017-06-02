package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DocumentController(val repository:DocumentRepository) {
	@GetMapping("/documents")
	fun findAll() = repository.findAll()
	
	@GetMapping("/document/{id}")
	fun findById(@PathVariable id:Long)
			= repository.findById(id)
	
	@GetMapping("/document/code/{code}")
	fun findByCode(@PathVariable code:String)
			= repository.findByCode(code)
}