package com.wfj.security.persist.dao;

import com.wfj.security.entity.Role;

public interface RoleDAO {

    int deleteByPrimaryKey(Long id);

    void insert(Role record);

    void insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}