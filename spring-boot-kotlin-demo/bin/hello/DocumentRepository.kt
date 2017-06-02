package hello

import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository


@Repository
interface DocumentRepository : CrudRepository<Document, Long> {
	
	fun findById(id: Long): Iterable<Document>
}