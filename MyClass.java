package com.thinkitive;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyClass {

	@RequestMapping(value = "/hi",method=RequestMethod.GET)
	public ModelAndView hello(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("Hello world");
		String name=request.getParameter("username");
		String pass=request.getParameter("pass");
		System.out.println(name);
		System.out.println(pass);
		
		ModelAndView model=new ModelAndView();
		model.addObject("message","this is a sample data");
		model.addObject("mess","this is mess");
		model.setViewName("Welcome.jsp");
		return model;
	}
	
	@RequestMapping(value = "/hi",method=RequestMethod.POST)
	public ModelAndView bye(String username,String pass) {
		System.out.println("bye world");
		//String name=request.getParameter("username");
		//String pass=request.getParameter("pass");
		System.out.println(username);
		System.out.println(pass);
		
		ModelAndView model=new ModelAndView();
		model.addObject("message","this is a sample data");
		model.addObject("mess","this is mess");
		model.setViewName("Welcome.jsp");
		return model;
	}
}
