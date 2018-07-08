package com.chulan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chulan.dao.UserTypeDao;
import com.chulan.model.UserType;

@Repository("userTypeDao")
public class UserTypeDaoImpl implements UserTypeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session currentSession() {
		
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(UserType uType) {
		currentSession().save(uType);
	}

	@Override
	public void update(UserType uType) {
		currentSession().update(uType);
	}

	@Override
	public UserType edit(int uTypeId) {
		
		return find(uTypeId);
	}

	@Override
	public void delete(int uTypeId) {
		
		UserType ut = new UserType();
		ut.setuTypeId(uTypeId);
		currentSession().delete(ut);

	}

	@Override
	public UserType find(int uTypeId) {
		return currentSession().get(UserType.class, uTypeId);
	}

	@Override
	public List<UserType> getAll() {
		
		return currentSession().createCriteria(UserType.class).list();
	}

}
