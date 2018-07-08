package com.chulan.dao;

import java.util.List;

import com.chulan.model.VehicleBrand;

public interface VehicleBrandDao {

	public VehicleBrand find(String bId);
	public List<VehicleBrand> getAll();
	
}
