package com.wfj.security.persist.dao;

import com.wfj.security.entity.Resource;

public interface ResourceDAO {

    int deleteByPrimaryKey(Long id);

    Resource selectByPrimaryKey(Long id);

}