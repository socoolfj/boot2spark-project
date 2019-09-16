package com.csylh.bootscala.controller;

import com.csylh.bootscala.entity.MetaDatabase;
import com.csylh.bootscala.service.MetaDatabaseService;
import com.csylh.bootscala.utils.ResultVO;
import com.csylh.bootscala.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @Author: 留歌36
 * @Date: 2019/9/16 21:33
 */
@RestController
@RequestMapping(value = "/meta")
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService databaseService;


    @RequestMapping(value = "/database",method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase database){
        databaseService.save(database);
        return ResultVOUtil.success();
    }

    @RequestMapping(value = "/database",method = RequestMethod.GET)
    public ResultVO query(){

        return ResultVOUtil.success(databaseService.getAll());
    }

}
