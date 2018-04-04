package com.test.server.rs;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.server.service.LoginService;

@Component("loginResource")
//@Path("/loginResource")
public class LoginResource {
	
	@Autowired
	private LoginService loginService;
	
	public void doLogin(String username, String password,HttpServletRequest request) throws Exception{
		
		loginService.doLogin(username, password,request);
	}

}
