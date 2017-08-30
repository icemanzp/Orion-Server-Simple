package com.jack.security.service;

import com.jack.security.entity.Resource;
import com.jack.security.entity.Role;

public interface FindResource {
	
	public Resource findResourceByID(Long id);
	
	public Role findRoleByID(Long id);
}