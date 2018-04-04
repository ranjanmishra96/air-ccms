package com.test.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.server.rs.LoginResource;
import com.test.server.validtor.LoginValidator;
import com.test.server.wsentity.WSUser;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private LoginValidator loginValidator;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	@Qualifier("loginResource")
	private LoginResource loginResource;
	
	String lastURL = "" ;
	
	@RequestMapping(value="/login.html" ,method=RequestMethod.GET)
	public String loadLoginForm(ModelMap modelMap){
		WSUser wsUser = new WSUser();
		modelMap.addAttribute("wsUser", wsUser);
		return "loginPage";
	}
}
