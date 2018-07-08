package com.chulan.service;

import java.util.List;

import com.chulan.model.VehicleBrand;

public interface VehicleBrandService {

	public VehicleBrand find(String vId);
	public List<VehicleBrand> getAll();
}
