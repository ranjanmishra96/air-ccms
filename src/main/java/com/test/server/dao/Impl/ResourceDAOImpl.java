package com.test.server.dao.Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.test.server.dao.ResourceDAO;
import com.test.server.domain.Resource;


@Repository("resourceDAO")
public class ResourceDAOImpl extends GenericDAOImpl<Resource, Long> implements ResourceDAO{

	public ResourceDAOImpl() {
		super(Resource.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resource getResourceByid(Long id) {
		// TODO Auto-generated method stub
		
		Criteria criteria = getCriteria(Resource.class);
		criteria.add(Restrictions.eq("id", id));
		
		return (Resource) criteria.uniqueResult();
	}

	@Override
	public List<Resource> getResource() {
		// TODO Auto-generated method stub
		
		Criteria criteria = getCriteria(Resource.class);
		@SuppressWarnings("unchecked")
		List<Resource> resources = criteria.list();
		return resources;
	}

}
