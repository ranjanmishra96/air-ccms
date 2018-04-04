package com.test.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.server.domain.User;
import com.test.server.service.UserService;

@Controller
@RequestMapping(value="/US")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/add.html", method=RequestMethod.GET)
	public ModelAndView addUserPage(@ModelAttribute User user){
		ModelAndView modelAndView = new ModelAndView("user-add-form");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}
	
	@RequestMapping(value="/add.html", method = RequestMethod.POST)
	public ModelAndView addingUser(@ModelAttribute User user){
		ModelAndView modelAndView = new ModelAndView("home");
		//userService.updateUserDetails(user);
		//Long id = userService.create(user);
		Long id = userService.createUser(user);
		String message = "User Add Successfully";
	
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/listOfUsers.html")
	public ModelAndView listOfUser(){
		ModelAndView modelAndView = new ModelAndView("list-of-users");
		try {
			List<User> users = userService.getUserDetails();
			modelAndView.addObject("users", users);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public  String editUserPage(@ModelAttribute  User user,@PathVariable Long id , Model  nodel,BindingResult bindingresult,final RedirectAttributes redirectAttributes){
		 user = userService.getUserById(id);
		 nodel.addAttribute("user",user);
		
		
		
		return "edit-user-form";
	}
	


	@RequestMapping(value="/edit/{id}" , method=RequestMethod.POST)
	public @ResponseBody ModelAndView editingUserPage(@ModelAttribute User user,@PathVariable Long id){
		ModelAndView modelAndView = new ModelAndView("home");
		userService.UpdateUser(user);
		String message = "User is modified successfully";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	
	@RequestMapping(value="/delete/{id}" , method = RequestMethod.GET)
	public String deleteUserrecord(@ModelAttribute  User user,@PathVariable Long id , Model  nodel,BindingResult bindingresult,final RedirectAttributes redirectAttributes){
		user = userService.getUserById(id);
		 nodel.addAttribute("user",user);
		return "edit-user-form";
	}
	
	@RequestMapping(value="/delete/{id}" , method = RequestMethod.POST)
	public ModelAndView deleteUser(@ModelAttribute User user , @PathVariable Long id){
		
		ModelAndView modelAndView = new ModelAndView("home");
		userService.deleteUser(user);
		String message ="User is deleted successfully";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
