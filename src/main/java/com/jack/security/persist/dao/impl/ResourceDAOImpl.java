package com.jack.security.persist.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jack.security.entity.Resource;
import com.jack.security.persist.dao.ResourceDAO;

@Repository
public class ResourceDAOImpl implements ResourceDAO {
	
	@Autowired  
    private SqlSessionTemplate sqlSessionTemplate; 

    public ResourceDAOImpl() {
        super();
    }

    public int deleteByPrimaryKey(Long id) {
        Resource _key = new Resource();
        _key.setId(id);
        int rows = sqlSessionTemplate.delete("sec_resource.deleteByPrimaryKey", _key);
        return rows;
    }

    public Resource selectByPrimaryKey(Long id) {
        return sqlSessionTemplate.selectOne("sec_resource.selectByPrimaryKey", id);
    }

}