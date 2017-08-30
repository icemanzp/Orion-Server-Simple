package com.jack.security.service.impl;

import com.jack.security.persist.dao.ResourceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jack.security.entity.Resource;
import com.jack.security.entity.Role;
import com.jack.security.persist.dao.RoleDAO;
import com.jack.security.service.FindResource;

@Service
public class FindResourceImpl implements FindResource {

	@Autowired
	private ResourceDAO rsDao;
	
	@Autowired
	private RoleDAO rDao;
	
	@Override
	public Resource findResourceByID(Long id) {
		// TODO Auto-generated method stub
		return rsDao.selectByPrimaryKey(id);
	}

	@Override
	public Role findRoleByID(Long id){
		// TODO Auto-generated method stub
		return rDao.selectByPrimaryKey(id);
	}
}
