package com.chulan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	private long vehicleId;
	
	@Size(min=3,max=10,message="Vehicle Type Should be between 3-10 characters.")
	private String vehicleType;
	
	@Size(min=3,max=10,message="Vehicle Brand Should be between 3-10 characters.")
	private String vehicleBrand;
	
	
	private int manufacyear;
	
	@Size(min=3,max=10,message="Vehicle Color Should be between 3-10 characters.")
	private String color;
	
	@Size(min=3,max=12,message="Vehicle No Should be between 3-12 characters.")
	private String vehicleNo;

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public int getManufacyear() {
		return manufacyear;
	}

	public void setManufacyear(int manufacyear) {
		this.manufacyear = manufacyear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
	
	
}
