package com.chulan.service;

import java.util.List;

import com.chulan.model.Vehicle;

public interface VehicleService {
	
	public void create(Vehicle vehicle);
	public void update(Vehicle vehicle);
	public Vehicle edit(Long vId);
	public void delete(Long vId);
	public Vehicle find(Long vId);
	public List<Vehicle> getAll();
}
