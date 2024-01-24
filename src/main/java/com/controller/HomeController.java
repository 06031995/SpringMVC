package com.controller;

import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.UserService.UserService;

@Controller
@RequestMapping("/main")
public class HomeController {

	private UserService userService;
	@RequestMapping("/home")
	 public String home( Model model){
		model.addAttribute("name", "rahul");
		model.addAttribute("Id", 1);
		
		List<String> list = new ArrayList();
		list.add("rahul");
		list.add("divya");
		list.add("sonal");
		
		model.addAttribute("f", list);
		System.out.println("this is index page");
		 return "index";
	 }
	
//	/@PostMapping(path="about")
	@RequestMapping(path="about",method=RequestMethod.POST)
	public ModelAndView about(){
		ModelAndView md = new ModelAndView();
		md.addObject("name","rahul");
		md.addObject("Id",2);
		List<String> list = new ArrayList();
		list.add("rahul");
		list.add("divya");
		list.add("sonal");
		md.addObject("list",list);
		md.setViewName("about");	
		LocalDate date =LocalDate.now();
		md.addObject("date",date);
		return md;
	}
}
