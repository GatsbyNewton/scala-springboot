package edu.wzm.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
  * Created by gatsbynewton on 2017/10/21.
  */
@Entity
@Table(name = "person")
class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @BeanProperty
    var id: Long = _

    @BeanProperty
    @Column(name = "name", nullable = true)
    var name: String = _

    @BeanProperty
    @Column(name = "age")
    var age: Int = _

    @BeanProperty
    @Column(name = "phone")
    var phone: String = _

    override def toString: String = s"Person(id=$id, name=$name, age=$age, phone=$phone)"
}
