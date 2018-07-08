package com.chulan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleType {

	@Id
	private String typeId;
	private String typename;
	private String status;
	
	public String getTypeId() {
		return this.typeId;
	}
	
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
