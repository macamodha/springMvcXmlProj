package com.chulan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloWorldController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		/*model.addAttribute("message", "Welcome From Spring MVC Controller");*/
		return "user/login";
	}
	
	@RequestMapping(value="/home/{name}",method=RequestMethod.GET)
	public String sayHelloAgain(@PathVariable("name") String nm, ModelMap model) {
		
		model.addAttribute("message", "Welcome Again From Spring MVC Controller");
		model.addAttribute("nameData", nm);
		return "welcome";
	}
}
