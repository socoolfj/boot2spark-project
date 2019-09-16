package com.csylh.bootscala.service;

import com.csylh.bootscala.dao.MetaDatabaseRepository;
import com.csylh.bootscala.entity.MetaDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description: TODO
 *
 * @Author: 留歌36
 * @Date: 2019/9/16 21:15
 */
@Service
public class MetaDatabaseService {
    @Autowired
    private MetaDatabaseRepository databaseRepository;


    @Transactional
    public void save(MetaDatabase metaDatabase){
        databaseRepository.save(metaDatabase);
    }

    public Iterable<MetaDatabase> getAll(){
        return databaseRepository.findAll();
    }



}
