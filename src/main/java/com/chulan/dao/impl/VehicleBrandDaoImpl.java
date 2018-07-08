package com.chulan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chulan.dao.VehicleBrandDao;
import com.chulan.model.VehicleBrand;

@Repository("vehiclebrandDao")
public class VehicleBrandDaoImpl implements VehicleBrandDao {

	@Autowired
	SessionFactory sessionfactory;
	
	private Session currentSession() {
		return sessionfactory.getCurrentSession();
	}
	
	@Override
	public VehicleBrand find(String bId) {
		return currentSession().get(VehicleBrand.class, bId);
	}

	@Override
	public List<VehicleBrand> getAll() {
		return currentSession().createCriteria(VehicleBrand.class).list();
	}

}
