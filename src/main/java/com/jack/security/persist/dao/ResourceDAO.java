package com.jack.security.persist.dao;

import com.jack.security.entity.Resource;

public interface ResourceDAO {

    int deleteByPrimaryKey(Long id);

    Resource selectByPrimaryKey(Long id);

}