package com.test.server.dao.Impl;



import org.springframework.stereotype.Repository;

import com.test.server.dao.ResourcePermissionDAO;
import com.test.server.domain.ResourcePermission;

@Repository("resourcePermissionDAO")
public class ResourcePermissionDAOImpl extends GenericDAOImpl<ResourcePermission, Long> implements ResourcePermissionDAO {

	public ResourcePermissionDAOImpl() {
		super(ResourcePermission.class);
		// TODO Auto-generated constructor stub
	}

}
