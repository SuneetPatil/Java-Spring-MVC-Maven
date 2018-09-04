package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	 @RequestMapping(value="/welcome.htm",method=RequestMethod.POST) 
	 public ModelAndView searchDetails(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) { 
		 String message = "Welcome "+request.getParameter("userName")+" to my new Spring Application!!!";
		 return new ModelAndView("welcome","message",message);
	 }	
	 
	 @RequestMapping(value="/company.htm",method=RequestMethod.POST) 
	 public ModelAndView company(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) { 
		 String message = "Welcome "+request.getParameter("company")+" to my new Spring Application!!!";
		 return new ModelAndView("company","message",message);
	 }	
}
