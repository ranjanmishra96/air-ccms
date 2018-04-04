package com.test.server.rs;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.server.domain.Resource;
import com.test.server.domain.ResourcePermission;
import com.test.server.exception.CCMSException;
import com.test.server.service.ResourcePermissionService;
import com.test.server.service.ResourceService;
import com.test.server.wsentity.WSResource;

@Component("resourceResource")
public class ResourceResource {
	
	@Autowired
	private ResourceService resourceService;
	
	@Autowired
	private ResourcePermissionService resourcePermissionService;
	
	@Autowired
	private DozerBeanMapper mapper;
	
//	public Long createResourcePermission(WSResource wsResource) throws CCMSException{
//		ResourcePermission resourcePermission = mapper.map(wsResource, ResourcePermission.class);
//		Long resourceid = resourcePermissionService.create(resourcePermission);
//		
//		return resourceid;
//	}

}
