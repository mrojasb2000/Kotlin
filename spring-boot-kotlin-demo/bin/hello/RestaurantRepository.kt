package hello

import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository

interface RestaurantRepository: CrudRepository<Restaurant, Long> {}