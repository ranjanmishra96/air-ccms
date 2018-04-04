package com.test.server.service.Impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.server.dao.GenericDAO;
import com.test.server.dao.ResourcePermissionDAO;
import com.test.server.domain.ResourcePermission;
import com.test.server.service.ResourcePermissionService;

@Service("resourcePermissionService")
public class ResourcePermissionServiceImpl extends CRUDServiceImpl<ResourcePermission> implements ResourcePermissionService {

	@Override
	public GenericDAO<ResourcePermission, Long> getBaseDAO() {
		// TODO Auto-generated method stub
		return resourcePermissionDAO;
	}
	
	@Autowired
	private ResourcePermissionDAO resourcePermissionDAO;

	@Override
	public Long createResourcePermission(ResourcePermission resourcePermission) {
		// TODO Auto-generated method stub
			
		Set<ResourcePermission> resourcePermissionList = new HashSet<ResourcePermission>();
		ResourcePermission resourcePermission1 = new ResourcePermission();
		resourcePermission1.setId(null);
		resourcePermission1.setActive(true);
		
		resourcePermissionList.add(resourcePermission1);
		
		return resourcePermissionDAO.create(resourcePermission1);
	}

}
