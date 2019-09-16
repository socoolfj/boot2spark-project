package com.csylh.bootscala.controller

import com.csylh.bootscala.entity.MetaTable
import com.csylh.bootscala.service.MetaTableService
import com.csylh.bootscala.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, RestController}

/**
  * Description: TODO
  *
  * @Author: 留歌36
  * @Date: 2019/9/16 21:50
  */
@RestController
@RequestMapping(value = Array("/meta"))
class MetaTableController @Autowired()(metaTableService: MetaTableService){


  @RequestMapping(value = Array("/table"),method = Array(RequestMethod.POST))
  def save(@ModelAttribute metaTable:MetaTable) ={
    metaTableService.save(metaTable)
    ResultVOUtil.success()
  }

  @RequestMapping(value = Array("/table"),method = Array(RequestMethod.GET))
  def query() ={
    ResultVOUtil.success(metaTableService.query())
  }

}
