package com.chulan.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chulan.model.UserType;
import com.chulan.service.UserTypeService;

@Controller
@RequestMapping("/userType/")
public class UserTypeController {

	@Autowired
	UserTypeService userTypeService;
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String register(Map<String,Object> map) {
		map.put("userType", new UserType());
		return "userType/create";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute("userType") UserType userType, BindingResult result, Map<String, Object> map) {
		
		if (result.hasErrors()) {
			return "userType/create";
		}
		userTypeService.create(userType);
		return "redirect:/userType/list";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Map<String, Object> map) {
		
		map.put("userTypeList", userTypeService.getAll());
		return "userType/list";
	}
	
	@RequestMapping(value="/details/{uTypeId}",method=RequestMethod.GET)
	public String details(@PathVariable("uTypeId") int uTypeId, Map<String, Object> map) {
		UserType ut = userTypeService.find(uTypeId);
		
		map.put("uTypeId", ut.getuTypeId());
		map.put("uTypeDescr", ut.getuTypeDescr());
		map.put("uTypeStat", ut.getuTypeStat());
		
		return "userType/details";
	}
	
	@RequestMapping(value="/edit/{uTypeId}",method=RequestMethod.GET)
	public String edit(@PathVariable("uTypeId") int uTypeId, Map<String, Object> map) {
		UserType userType = userTypeService.find(uTypeId);
		map.put("userType", userType);
		
		return "userType/edit";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@Valid @ModelAttribute("userType") UserType userType, BindingResult result, Map<String, Object> map) {
		
		if(result.hasErrors()) {
			return "userType/edit";
		}
		userTypeService.update(userType);
		return "redirect:/userType/list";
	}
	
	@RequestMapping(value="/delete/{uTypeId}",method=RequestMethod.GET)
	public String delete(@PathVariable("uTypeId") int uTypeId, Map<String, Object> map) {
		userTypeService.delete(uTypeId);
		return "redirect:/userType/list";
	}
	
}
