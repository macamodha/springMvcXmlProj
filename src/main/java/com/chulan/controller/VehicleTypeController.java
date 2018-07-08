package com.chulan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.chulan.service.VehicleTypeService;

@Controller
public class VehicleTypeController {

	@Autowired
	VehicleTypeService vehicletypeService;
	
	
}
