package com.csylh.bootscala.service

import com.csylh.bootscala.dao.MetaTableRepository
import com.csylh.bootscala.entity.MetaTable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * Description: TODO
  *
  * @Author: 留歌36
  * @Date: 2019/9/16 21:47
  */
@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository) {

  @Transactional
  def save(metaTable:MetaTable): Unit ={
    metaTableRepository.save(metaTable)
  }

  def query() ={
    metaTableRepository.findAll()
  }
}
