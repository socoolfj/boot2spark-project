package com.csylh.bootscala.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Description: 数据库 元数据
 *
 * @Author: 留歌36
 * @Date: 2019/9/16 21:07
 */
@Entity
@Table
@Data
public class MetaDatabase {
    @Id
    @GeneratedValue
    /**数据库ID*/
    private Integer id;

    /**数据库名称*/
    private String name;

    /**数据库存放的文件系统地址*/
    private String location;
}
