package com.csylh.bootscala.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @Author: 留歌36
 * @Date: 2019/9/16 22:07
 */
@RestController
public class HelloController {


    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello 留歌36~~~";
    }
}
