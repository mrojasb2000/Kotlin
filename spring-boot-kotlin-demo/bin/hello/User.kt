package hello

class User(val id: Int, val name: String) {
	
	override fun toString(): String {
		return "Document(id=$id, name='$name')"
	}
}