package com.test.server.service.Impl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.server.exception.CCMSException;
import com.test.server.service.LoginService;
import com.test.server.wsentity.WSUser;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	ServletContext context;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	

	@Override
	public void doLogin(String username, String password,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		WSUser wsUser =null;
		
	}

}
