package com.chulan.service;

import java.util.List;

import com.chulan.model.VehicleType;

public interface VehicleTypeService {
	
	public VehicleType find(String typeId);
	public List<VehicleType> getAll();
}
