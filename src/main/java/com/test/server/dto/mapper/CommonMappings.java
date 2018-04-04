package com.test.server.dto.mapper;

import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

import com.test.server.domain.Resource;
import com.test.server.wsentity.WSNameValue;
import com.test.server.wsentity.WSResource;

public class CommonMappings extends BeanMappingBuilder {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		
		//mapping(typeA, typeB, typeMappingOption)
		mapping(Resource.class, WSResource.class, TypeMappingOptions.oneWay()).fields("id", "id");
		
		mapping(Resource.class, WSNameValue.class).fields("id", "id").fields("fullName", "value");
	}

}
