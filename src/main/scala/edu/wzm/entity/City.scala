package edu.wzm.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Entity
@Table(name = "city")
class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @BeanProperty
    var id: Long = _

    @BeanProperty
    @Column(name = "country", nullable = false)
    var country: String = _

    @BeanProperty
    @Column(name = "name", nullable = false)
    var name: String = _

    @BeanProperty
    @Column(name = "state", nullable = false)
    var state: String = _

    @BeanProperty
    @Column(name = "map", nullable = false)
    var map: String = _

    override def toString: String = s"City(id=$id, country=$country, name=$name, state=$state, map=$map)"
}
