package com.chulan.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chulan.model.Vehicle;
import com.chulan.service.VehicleBrandService;
import com.chulan.service.VehicleService;
import com.chulan.service.VehicleTypeService;

@Controller
@RequestMapping("/vehicle/")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	@Autowired
	VehicleTypeService vehicletypeService;
	@Autowired
	VehicleBrandService vehiclebrandService; 
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Map<String,Object> map) {
		map.put("vehicleList", vehicleService.getAll());
		return "vehicle/list";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public String create(Map<String,Object> map) {
		map.put("vehicle", new Vehicle());
		map.put("vehicleTypeList", vehicletypeService.getAll());
		map.put("vehicleBrandList", vehiclebrandService.getAll());
		return "vehicle/create";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@Valid @ModelAttribute("vehicle") Vehicle vehicle, BindingResult result, Map<String,Object> map) {
		
		if (result.hasErrors()) {
			map.put("vehicleTypeList", vehicletypeService.getAll());
			map.put("vehicleBrandList", vehiclebrandService.getAll());
			return "vehicle/create";
		}
		vehicleService.create(vehicle);
		return "redirect:/vehicle/list";
	}
	
}
