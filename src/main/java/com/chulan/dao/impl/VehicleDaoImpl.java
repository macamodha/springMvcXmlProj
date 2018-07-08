package com.chulan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chulan.dao.VehicleDao;
import com.chulan.model.Vehicle;

@Repository("vehicleDao")
public class VehicleDaoImpl implements VehicleDao{

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void create(Vehicle vehicle) {
		currentSession().save(vehicle);
		
	}

	@Override
	public void update(Vehicle vehicle) {
		currentSession().update(vehicle);
		
	}

	@Override
	public Vehicle edit(Long vId) {
		
		return find(vId);
	}

	@Override
	public void delete(Long vId) {
		Vehicle v = new Vehicle();
		v.setVehicleId(vId);
		currentSession().delete(v);
		
	}

	@Override
	public Vehicle find(Long vId) {
		
		return currentSession().get(Vehicle.class, vId);
	}

	@Override
	public List<Vehicle> getAll() {
		return currentSession().createCriteria(Vehicle.class).list();
	}

	
}
