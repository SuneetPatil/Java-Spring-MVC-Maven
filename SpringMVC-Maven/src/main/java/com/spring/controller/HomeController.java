package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.ServiceLayer;

@Controller
public class HomeController {
	
	@Autowired
	ServiceLayer serviceLayer;
	
	 @RequestMapping(value="/welcome.htm",method=RequestMethod.POST) 
	 public ModelAndView searchDetails(HttpServletRequest request,HttpServletResponse response,ModelMap modelMap) { 
		 System.out.println(request.getParameter("userName")+"---"+request.getParameter("gender"));
		 return new ModelAndView("welcome","message",serviceLayer.getMessage(request.getParameter("userName"),request.getParameter("gender")));
	 }	  
}
