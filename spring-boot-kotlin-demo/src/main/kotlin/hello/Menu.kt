package hello

import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

import java.util.Date

@Entity
@Table(name = "menus")
data class Menu(
	@Id @GeneratedValue(strategy = IDENTITY)
    var id: Long? = -1,

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    var restaurant: Restaurant? = null,

	//, columnDefinition = "DATE"
    @Column(name = "menu_date")	
    var date: Date? = null,

    var title: String? = null,

    @Column(name = "menu_text")
    var text: String? = null
	)
{
	
	override fun toString(): String {
		return "Menu(id=$id, date='$date', title='$title', text='$text')"
	}
}