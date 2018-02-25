package edu.wzm.repository

import edu.wzm.entity.{Order, OrderDetail}
import org.springframework.data.jpa.repository.{JpaRepository, Query}
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

import java.util.{List => JList}

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Repository
trait OrderRepository extends JpaRepository[Order, java.lang.Long]{

    /* 实体类必须包含包名 */
    @Query(value = "SELECT new edu.wzm.entity.OrderDetail(o.id, c.name, o.name, o.price) " +
            "FROM Order o, Customer c " +
            "WHERE o.name = c.product")
    def findOrderDetail(): JList[OrderDetail]
}
