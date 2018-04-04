package com.test.server.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dozer.DozerBeanMapper;
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

import com.test.server.domain.Resource;
import com.test.server.domain.ResourcePermission;
import com.test.server.domain.User;
import com.test.server.exception.CCMSException;
import com.test.server.service.ResourcePermissionService;
import com.test.server.service.ResourceService;
import com.test.server.wsentity.WSResource;

@Controller
@RequestMapping(value="/RS")
public class ResourceController {
	
	@Autowired
	private ResourceService resourceService;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Autowired
	private ResourcePermissionService resourcePermissionService;
	
	
	@RequestMapping(value="/add.html" , method=RequestMethod.GET)
	public ModelAndView addResourcePage(@ModelAttribute Resource resource){
		ModelAndView modelAndView = new ModelAndView("resource-add-form");
		modelAndView.addObject("resource", resource);
		return modelAndView;
		
	}
	

//	}
	
	@RequestMapping(value="/add.html" ,method=RequestMethod.POST)
	public ModelAndView addingResourcePage(@ModelAttribute Resource resource){
		ModelAndView modelAndView = new ModelAndView("home");
		//ResourcePermission resourcePermission = mapper.map(resource, ResourcePermission.class);
		//Long resourcePermissionId = resourcePermissionService.create(resourcePermission);
		
		Set<ResourcePermission> resourcePermissionList = new HashSet<ResourcePermission>();
		ResourcePermission resourcePermission = new ResourcePermission();
		resourcePermission.setActive(true);
		//resourcePermission.setResource(resource);
		
		resourcePermissionList.add(resourcePermission);
		
		resource.setResourcePermission(resourcePermissionList);
		Long id = resourceService.create(resource);
		//Long id = resourceService.createResource(resource);
		System.out.println(id);
		List<ResourcePermission> list = new ArrayList<ResourcePermission>();
		//list.addAll(id);
		
		//Long id = resourcePermissionService.create(resourcePermission);
		String message = "Resource added successfully";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

	
	@RequestMapping(value="/listOfResources")
	public ModelAndView listOfResources(){
		ModelAndView modelAndView = new ModelAndView("list-of-resources");
		try {
			
			List<Resource> resource = resourceService.getResource();
			modelAndView.addObject("resource", resource);				
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		return  modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public  String editUserPage(@ModelAttribute  Resource resource,@PathVariable("id") Long id , Model  nodel,BindingResult bindingresult,final RedirectAttributes redirectAttributes){
		 //user = userService.getUserById(id);
		resource = resourceService.getResourceByid(id);
		nodel.addAttribute("resource",resource);
		return "edit-resource-form";
	}
	


	@RequestMapping(value="/edit/{id}" , method=RequestMethod.POST)
	public @ResponseBody ModelAndView editingResourcePage(@ModelAttribute Resource resource,@PathVariable Long id){
		ModelAndView modelAndView = new ModelAndView("home");
		resourceService.updateResource(resource);;
		String message = "Resource is modified successfully";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	
	@RequestMapping(value="/delete/{id}" , method = RequestMethod.GET)
	public String deleteUserrecord(@ModelAttribute  Resource resource,@PathVariable Long id , Model  nodel,BindingResult bindingresult,final RedirectAttributes redirectAttributes){
		//user = userService.getUserById(id);
		resource = resourceService.getResourceByid(id);
		 nodel.addAttribute("resource",resource);
		return "edit-resource-form";
	}
	
	@RequestMapping(value="/delete/{id}" , method = RequestMethod.POST)
	public ModelAndView deleteUser(@ModelAttribute Resource resource , @PathVariable Long id){
		
		ModelAndView modelAndView = new ModelAndView("home");
		resourceService.deleteResource(resource);
		String message ="Resource is deleted successfully";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	
}
