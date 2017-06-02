package hello

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestBody

@RestController
class BookController {
	
	// Out book's database
	@Autowired
	private lateinit var database: BookDatabase
	
	@RequestMapping(value="", method = arrayOf(RequestMethod.GET))
	fun books() = database.getBooks()
	
	@RequestMapping("", method = arrayOf(RequestMethod.POST))
	fun addBook(@RequestBody book: Book) =
			if(database.addBook(book)) book
			else throw DuplicateItemException()
}