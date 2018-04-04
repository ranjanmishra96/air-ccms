package com.test.server.service;

import java.util.List;

import com.test.server.domain.Resource;
import com.test.server.exception.CCMSException;

public interface ResourceService extends CRUDService<Resource> {

	
	
	public Resource getResourceByid(Long id);
	
	public List<Resource> getResource() throws CCMSException;
	
	public void updateResource(Resource resource);
	
	public void deleteResource(Resource resource);

	public Long createResource(Resource resource);

}
