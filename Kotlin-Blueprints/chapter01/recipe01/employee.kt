data class Employee(val id: Long, var name: String)

fun main(args: Array<String>) {
    val emp = Employee(1, "Mavro") 
    println(emp.name)    
}