package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class WebAppOne {
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("attr1", "Welcome to WEB MVC module");
		mav.addObject("attr2", "Its the Fist Application in Web MVC");
		mav.setViewName("index");
		return mav;
	}
}
