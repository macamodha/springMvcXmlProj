package com.chulan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chulan.dao.UserDao;
import com.chulan.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void create(User user) {
		currentSession().save(user);
	}

	@Override
	public void update(User user) {
		currentSession().update(user);
	}

	@Override
	public User edit(Long userId) {
		return find(userId);
	}

	@Override
	public void delete(Long userId) {
		User u = new User();
		u.setUserId(userId);
		currentSession().delete(u);
	}

	@Override
	public User find(Long userId) {
		return (User)currentSession().get(User.class, userId);
	}

	@Override
	public List<User> getAll() {
//	return currentSession().createQuery("from User").getResultList(); this apply to hibernate-core 5.2 versions
		return currentSession().createCriteria(User.class).list();
	}

}
