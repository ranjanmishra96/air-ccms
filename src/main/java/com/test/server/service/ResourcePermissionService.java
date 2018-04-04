package com.test.server.service;

import com.test.server.domain.ResourcePermission;

public interface ResourcePermissionService extends CRUDService<ResourcePermission> {

	public Long createResourcePermission(ResourcePermission resourcePermission);

}
