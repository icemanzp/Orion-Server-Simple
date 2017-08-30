package com.jack.security.persist.dao;

import com.jack.security.entity.Role;

public interface RoleDAO {

    int deleteByPrimaryKey(Long id);

    void insert(Role record);

    void insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}