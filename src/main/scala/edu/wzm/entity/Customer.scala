package edu.wzm.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Entity
@Table(name = "customer")
class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @BeanProperty
    var id: Int = _

    @BeanProperty
    @Column(name = "name")
    var name: String = _

    @BeanProperty
    @Column(name = "cost", nullable = true)
    var cost: Float = _

    @BeanProperty
    @Column(name = "product")
    var product: String = _

    override def toString = s"Customer($id, $name, $cost, $product)"
}
