package com.wfj.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfj.security.entity.Resource;
import com.wfj.security.entity.Role;
import com.wfj.security.persist.dao.ResourceDAO;
import com.wfj.security.persist.dao.RoleDAO;
import com.wfj.security.service.FindResource;

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
