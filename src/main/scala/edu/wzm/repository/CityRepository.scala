package edu.wzm.repository

import java.util.{List => JList}

import edu.wzm.entity.City
import org.springframework.data.jpa.repository.{JpaRepository, JpaSpecificationExecutor, Modifying, Query}
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Repository
trait CityRepository extends JpaRepository[City, java.lang.Long] with JpaSpecificationExecutor[City]{

    @Query(value = "SELECT c.id, c.country, c.name, c.state, c.map " +
            " FROM city c " +
            " WHERE c.id = :id", nativeQuery = true)
    def selectById(@Param("id") id: Int): City

    @Query("SELECT c.id, c.country, c.name, c.state, c.map " +
            " FROM City c")
    def selectAll(): JList[City]  /* // 隐式转换，直接用scala的List会报错: javax.persistence.NonUniqueResultException: result returns more than one elements] with root cause */

    @Query("SELECT c.id, c.country, c.name, c.state, c.map " +
            " FROM City c " +
            " WHERE c.country = ?1 and c.name = ?2")
    def selectByCountryAndName(country: String, name: String): City

    @Modifying
    @Transactional
    @Query(value = "UPDATE city c " +
            " SET c.name = :name " +
            " WHERE c.id = :id", nativeQuery = true)
    def setName(@Param("name") name: String, @Param("id") id: Int): Int

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM city c " +
            " WHERE c.id = :id", nativeQuery = true)
    def deleteById(@Param("id") id: Int): Int
}
