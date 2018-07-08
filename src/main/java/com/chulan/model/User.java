package com.chulan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long userId;
	
	@Size(min=2, max=10,message="First Name should be between 2-10 characters.")
	private String fName;
	
	@Size(min=2, max=20,message="Last Name should be between 2-20 characters.")
	private String lName;
	
	@Size(min=1, message="Invalid Email Address Entered.")
	@Email(message="Invalid Email Address Entered.")
	private String email;
	
	@Size(min=4, message="Password must be at least 4 characters.")
	private String psw;
	
	@Size(min=10, max=10, message="Mobile No should be 10 digits.")
	private String mobile;
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public long getUserId() {
		return userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
}
