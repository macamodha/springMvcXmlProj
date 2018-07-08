package com.chulan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chulan.dao.VehicleBrandDao;
import com.chulan.model.VehicleBrand;
import com.chulan.service.VehicleBrandService;

@Service("vehiclebrandService")
@Transactional(propagation=Propagation.SUPPORTS,rollbackFor=Exception.class)
public class VehicleBrandServiceImpl implements VehicleBrandService{

	@Autowired
	VehicleBrandDao vehiclebrandDao;
	
	@Override
	public VehicleBrand find(String vId) {
		return vehiclebrandDao.find(vId);
	}

	@Override
	public List<VehicleBrand> getAll() {
		return vehiclebrandDao.getAll();
	}

}
