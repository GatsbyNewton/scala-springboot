package edu.wzm.repository

import edu.wzm.entity.Hotel
import org.springframework.data.jpa.repository.{JpaRepository, Query}
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Repository
trait HotelRepository extends JpaRepository[Hotel, java.lang.Long]{

    @Query(value = "SELECT h.id, h.city_id, h.name, h.address, h.zip " +
            " FROM hotel h " +
            " WHERE h.id = :id", nativeQuery = true)
    def selectById(@Param("id") id: Int): Hotel
}
