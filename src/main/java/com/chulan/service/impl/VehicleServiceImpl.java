package com.chulan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chulan.dao.VehicleDao;
import com.chulan.model.Vehicle;
import com.chulan.service.VehicleService;

@Service("vehicleService")
@Transactional(propagation=Propagation.SUPPORTS, rollbackFor=Exception.class)
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleDao vehicleDao;
	
	@Override
	public void create(Vehicle vehicle) {
		vehicleDao.create(vehicle);
	}

	@Override
	public void update(Vehicle vehicle) {
		vehicleDao.update(vehicle);
	}

	@Override
	public Vehicle edit(Long vId) {
		return vehicleDao.edit(vId);
	}

	@Override
	public void delete(Long vId) {
		vehicleDao.delete(vId);
	}

	@Override
	public Vehicle find(Long vId) {
		return vehicleDao.find(vId);
	}

	@Override
	public List<Vehicle> getAll() {
		return vehicleDao.getAll();
	}

}
