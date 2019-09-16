package com.csylh.bootscala.service;

import com.csylh.bootscala.entity.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: TODO
 *
 * @Author: 留歌36
 * @Date: 2019/9/16 21:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDataStoreServiceTest {

    @Autowired
    private MetaDatabaseService databaseService;

    @Test
    public void save(){
        MetaDatabase database = new MetaDatabase();
        database.setName("default");
        database.setLocation("hdfs://hadoop001:8020/user/hive/warehouse");

        databaseService.save(database);
    }


    @Test
    public void query(){
        Iterable<MetaDatabase> databaseIterable = databaseService.getAll();
        for (MetaDatabase database : databaseIterable){
            System.out.println(database.getId());
            System.out.println(database.getName());
            System.out.println(database.getLocation());
        }


    }
}
