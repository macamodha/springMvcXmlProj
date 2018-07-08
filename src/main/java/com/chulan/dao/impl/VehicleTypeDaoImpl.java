package com.chulan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chulan.dao.VehicleTypeDao;
import com.chulan.model.VehicleType;

@Repository("vehicletypeDao")
public class VehicleTypeDaoImpl  implements VehicleTypeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public VehicleType find(String typeId) {
		return currentSession().get(VehicleType.class, typeId);
	}

	@Override
	public List<VehicleType> getAll() {
		return currentSession().createCriteria(VehicleType.class).list();
	}

}
