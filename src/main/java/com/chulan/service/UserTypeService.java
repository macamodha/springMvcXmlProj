package com.chulan.service;

import java.util.List;

import com.chulan.model.UserType;

public interface UserTypeService {
	public void create(UserType uType);
	public void update(UserType uType);
	public UserType edit(int uTypeId);
	public void delete(int uTypeId);
	public UserType find(int uTypeId);
	public List<UserType> getAll();
}
