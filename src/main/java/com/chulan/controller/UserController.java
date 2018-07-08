package com.chulan.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.chulan.model.User;
import com.chulan.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Map<String,Object> map) {
		map.put("user", new User());
		return "user/register";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("user") User user , BindingResult result ,Map<String,Object> map) {
		
		if (result.hasErrors()) {
			return "user/register";
		}
		userService.create(user);
		//return "redirect:/user/details/" + user.getUserId();
		return "redirect:/user/list";
	}
	
//	@RequestMapping(value="/user/details", method=RequestMethod.POST)
//	public String details(@RequestParam("fName") String fName,
//			@RequestParam("lName") String lName,
//			@RequestParam("email") String email,
//			@RequestParam("mobile") String mobile,
//			Map<String,Object> map) {
	
	@RequestMapping(value="/details/{userId}", method=RequestMethod.GET)
	public String details(@PathVariable("userId") Long uId,Map<String,Object> map) {
		
		User user = userService.find(uId);
		map.put("fName", user.getfName());
		map.put("lName", user.getlName());
		map.put("email", user.getEmail());
		map.put("mobile", user.getMobile());
		
		return "user/details";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Map<String,Object> map) {
		map.put("userList", userService.getAll());
		
		return "user/list";
	}
	
	@RequestMapping(value="/edit/{userId}", method=RequestMethod.GET)
	public String edit(@PathVariable("userId") Long usrId, Map<String,Object> map) {
		User user = userService.find(usrId);
		map.put("user", user);
		
		return "user/edit";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@Valid @ModelAttribute("user") User user,BindingResult result, Map<String,Object> map) {
		
		if (result.hasErrors()) {
			return "user/edit";
		}
		userService.update(user);
		
		return "redirect:/user/list";
	}
	
	@RequestMapping(value="/delete/{userId}",method=RequestMethod.GET)
	public String delete(@PathVariable("userId") Long userId, Map<String,Object> map) {
		userService.delete(userId);
				
		return "redirect:/user/list";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("email") String email,
						@RequestParam("psw") String psw,
						Map<String,Object> map) {
		
		List<User> usrList = userService.getAll();
		for (User u : usrList) {
			if(u.getEmail().equals(email) && u.getPsw().equals(psw)) {
				return "redirect:/user/home";
			}
			
		}
		
		map.put("message", "Invalid Email or Password provided.");
		return "/user/login";					
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Map<String,Object> map) {
		
		return "/user/home";
	}
}
