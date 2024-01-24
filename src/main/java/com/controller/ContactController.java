package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.UserService.UserService;
import com.model.User;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	
	@RequestMapping(path="/contact")
    public String contact(){
    	return "contact";
    }
	
	/*@RequestMapping(path="/processForm" ,method=RequestMethod.POST)
	public String getData(@RequestParam("username") String username,
			@RequestParam("exampleInputEmail1")String exampleInputEmail1,
			@RequestParam("exampleInputPassword1") String exampleInputPassword1,Model model
			){
		User user= new User();
		System.out.println(user);
		user.setUsername(username);
		user.setExampleInputEmail1(exampleInputEmail1);
		user.setExampleInputPassword1(exampleInputPassword1);
		model.addAttribute("username",user);
		System.out.println("hii");
	
		return "contact";
		
	}*/
	
	@RequestMapping(path="/processForm" ,method=RequestMethod.POST)
	public String getData(@ModelAttribute User user,Model model	){		
		System.out.println(user);	
		model.addAttribute("username",user);
		System.out.println("hii");
	
	    int saveData = this.userService.saveData(user);

		return "contact";
		
	}
}
