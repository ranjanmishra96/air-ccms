package com.test.server.service.Impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.server.dao.GenericDAO;
import com.test.server.dao.ResourceDAO;
import com.test.server.domain.Resource;
import com.test.server.domain.ResourcePermission;
import com.test.server.exception.CCMSException;
import com.test.server.service.ResourceService;


@Service("resourceService")
public class ResourceServiceImpl extends CRUDServiceImpl<Resource> implements ResourceService{

	@Override
	public GenericDAO<Resource, Long> getBaseDAO() {
		// TODO Auto-generated method stub
		return resourceDAO;
	}

	@Autowired
	private ResourceDAO resourceDAO;

	

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public Resource getResourceByid(Long id) {
		// TODO Auto-generated method stub
		
		return resourceDAO.getResourceByid(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void updateResource(Resource resource) {
		// TODO Auto-generated method stub
		resourceDAO.update(resource);
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void deleteResource(Resource resource) {
		// TODO Auto-generated method stub
		resourceDAO.delete(resource);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public List<Resource> getResource() throws CCMSException {
		// TODO Auto-generated method stub
		return resourceDAO.getResource();
	}

	@Override
	public Long createResource(Resource resource) {
		// TODO Auto-generated method stub
		
		List<Resource> resourceList = new ArrayList<Resource>();
		Resource resource1 = new Resource();
		resource1.setId(resource.getId());
		Set<ResourcePermission> resourcePermissionList = new HashSet<ResourcePermission>();
		ResourcePermission resourcePermission = new ResourcePermission();
		resourcePermission.setId(null);
		resourcePermission.setActive(true);
		resourcePermission.setResource(resource);
		
		//resourcePermissionList.add(resourcePermission);
		resource.setResourcePermission(resourcePermissionList);
		resourcePermissionList.add(resourcePermission);
		Long id = resourceDAO.create(resource);
		return id;
	}

	
}
