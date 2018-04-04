package com.test.server.dao;

import java.util.List;

import com.test.server.domain.Resource;

public interface ResourceDAO extends GenericDAO<Resource, Long> {

	public Resource getResourceByid(Long id);

	public List<Resource> getResource();
	

}
