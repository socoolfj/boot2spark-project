package com.csylh.bootscala.dao

import com.csylh.bootscala.entity.MetaTable
import org.springframework.data.repository.CrudRepository

/**
  * Description: TODO
  *
  * @Author: 留歌36
  * @Date: 2019/9/16 21:46
  */
trait MetaTableRepository extends CrudRepository[MetaTable, Integer]{

}
