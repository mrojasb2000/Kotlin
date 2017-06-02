package hello


import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Table(name = "restaurants")
class Restaurant(
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	val id: Long = -1,
    val name: String? = null,
    val location: String? = null,
    val lat: Double? = null,
    var lng: Double? = null,

    @OneToMany(mappedBy = "restaurant")
	var menus: List<Menu>? = null
	)
{
}