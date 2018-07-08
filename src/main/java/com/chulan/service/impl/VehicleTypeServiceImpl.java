package com.chulan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chulan.dao.VehicleTypeDao;
import com.chulan.model.VehicleType;
import com.chulan.service.VehicleTypeService;

@Service("vehicletypeService")
@Transactional(propagation=Propagation.SUPPORTS,rollbackFor=Exception.class)
public class VehicleTypeServiceImpl implements VehicleTypeService{

	@Autowired
	VehicleTypeDao vehicletypeDao;
	
	@Override
	public VehicleType find(String typeId) {
		return vehicletypeDao.find(typeId);
	}

	@Override
	public List<VehicleType> getAll() {
		return vehicletypeDao.getAll();
	}

}
