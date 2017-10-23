package edu.wzm.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Entity
@Table(name = "hotel")
class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @BeanProperty
    var id: Long = _

    @BeanProperty
    @Column(name = "city_id", nullable = false)
    var cityId: Long = _

    @BeanProperty
    @Column(name = "name", nullable = false)
    var name: String = _

    @BeanProperty
    @Column(name = "address")
    var address: String = _

    @BeanProperty
    @Column(name = "zip")
    var zip: String = _

    override def toString: String = s"Hotel(id=$id, cityId=$cityId, address=$address, zip=$zip)"
}
