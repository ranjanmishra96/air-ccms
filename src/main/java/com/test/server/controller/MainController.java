package com.test.server.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/CF")
public class MainController {
	

	@RequestMapping(value="/welcome.html" ,method = RequestMethod.GET)
	public String welcomePage(Model model){
		model.addAttribute("title","Welcome");
		model.addAttribute("message", "This is welcome page");
		return "welcomePage";
	}
	
	@RequestMapping(value="/admin.html", method= RequestMethod.GET)
	public String adminPage(Model model){
		return "adminPage";
	}
	
	 @RequestMapping(value = "/login.html", method = RequestMethod.GET)
	    public String loginPage(Model model ) {
	        
	        return "loginPage";
	    }

	    @RequestMapping(value = "/logoutSuccessful.html", method = RequestMethod.GET)
	    public String logoutSuccessfulPage(Model model) {
	        model.addAttribute("title", "Logout");
	        return "logoutSuccessfulPage";
	    }

	    @RequestMapping(value = "/userInfo.html", method = RequestMethod.GET)
	    public String userInfo(Model model, Principal principal) {

	        // After user login successfully.
	        String userName = principal.getName();

	        System.out.println("User Name: "+ userName);

	        return "userInfoPage";
	    }


}
