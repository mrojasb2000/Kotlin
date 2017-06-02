package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
* Validator used to check whether given string is
* no longer than specified amount of characters.
*
* @author Vojtech Ruzicka
*/
class Book() {
	lateinit var ISBN: String
	lateinit var title: String
	lateinit var author: String
	var coverURL: String? = null
	
	constructor(
		ISBN: String,
		title: String,
		author: String,
		coverURL: String? = null): this() {
			this.ISBN = ISBN
			this.title = title
			this.author = author
			this.coverURL = coverURL
		}
}