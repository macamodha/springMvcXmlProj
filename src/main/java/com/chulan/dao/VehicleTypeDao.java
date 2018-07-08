package com.chulan.dao;

import java.util.List;

import com.chulan.model.VehicleType;

public interface VehicleTypeDao {
	
	public VehicleType find(String typeId);
	public List<VehicleType> getAll();
}
