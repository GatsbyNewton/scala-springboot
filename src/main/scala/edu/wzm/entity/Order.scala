package edu.wzm.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
  * Created by gatsbynewton on 2017/10/21.
  */
case class OrderDetail(id: Int,
                       customer: String,
                       name: String,
                       price: Float)

@Entity
@Table(name = "orders")
class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @BeanProperty
    var id: Int = _

    @BeanProperty
    @Column(name = "price", nullable = false)
    var price: Float = _

    @BeanProperty
    @Column(name = "name", nullable = false)
    var name: String = _

    override def toString = s"Order($id, $price, $name)"
}
