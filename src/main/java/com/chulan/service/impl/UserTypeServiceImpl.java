package com.chulan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chulan.dao.UserTypeDao;
import com.chulan.model.UserType;
import com.chulan.service.UserTypeService;

@Service("userTypeService")
@Transactional(propagation=Propagation.SUPPORTS, rollbackFor=Exception.class)
public class UserTypeServiceImpl implements UserTypeService {

	
	@Autowired
	UserTypeDao userTypeDao;
	
	@Override
	public void create(UserType uType) {
		userTypeDao.create(uType);
	}

	@Override
	public void update(UserType uType) {
		userTypeDao.update(uType);
	}

	@Override
	public UserType edit(int uTypeId) {
		
		return userTypeDao.edit(uTypeId);
	}

	@Override
	public void delete(int uTypeId) {
		userTypeDao.delete(uTypeId);
	}

	@Override
	public UserType find(int uTypeId) {
		
		return userTypeDao.find(uTypeId);
	}

	@Override
	public List<UserType> getAll() {
		
		return userTypeDao.getAll();
	}

}
