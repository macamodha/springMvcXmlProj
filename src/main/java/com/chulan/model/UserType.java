package com.chulan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class UserType {

	@Id
	@GeneratedValue
	private int uTypeId;
	
	@Size(min=2,max=20,message="User Type Description should be between 2-20 characters.")
	private String uTypeDescr;
	
	@Size(min=1,max=1,message="Please select a User Status")
	private String uTypeStat;

	public int getuTypeId() {
		return uTypeId;
	}

	public void setuTypeId(int uTypeId) {
		this.uTypeId = uTypeId;
	}

	public String getuTypeDescr() {
		return uTypeDescr;
	}

	public void setuTypeDescr(String uTypeDescr) {
		this.uTypeDescr = uTypeDescr;
	}

	public String getuTypeStat() {
		return uTypeStat;
	}

	public void setuTypeStat(String uTypeStat) {
		this.uTypeStat = uTypeStat;
	}
	
}
