package com.csylh.bootscala.entity

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

/**
  * Description:
  *
  * @Author: 留歌36
  * @Date: 2019/9/16 21:41
  */
@Entity
@Table
class MetaTable {

  @Id
  @GeneratedValue
  @BeanProperty
  var id:Integer = _

  @BeanProperty
  var tableTame:String = _

  @BeanProperty
  var tableType:String = _

  @BeanProperty
  var dbId:Integer = _

}
