package com.javainuse.springboothelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	//@RequestMapping("/welcome")
	//public ModelAndView firstPage() {
	//	return new ModelAndView("welcome");
	//}
	
	@RequestMapping("/welcome")
	public String firstPage() {
		return "welcome to Spring boot";
	}

}
