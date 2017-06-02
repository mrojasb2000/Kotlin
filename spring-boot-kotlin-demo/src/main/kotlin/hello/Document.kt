package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

import java.util.Date

@Entity
class Document(	
	val code: String,
	val name: String,
	var status: Int,
	val type: Int,
	val version: Int, 
	val owner: Int,
	val createdDated: Date,
	val lastModifiedDated: Date,
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	val id: Long = -1		
	)
	{

	override fun toString(): String {
		return "Document(id=$id, code='$code', name='$name', status='$status', type='$type', version='$version')"
	}
}