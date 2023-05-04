package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class student {
	
	@Id
	private int stId;
	private String stName;
	private String stClass;

	@OneToOne
	private car c1;

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStClass() {
		return stClass;
	}

	public void setStClass(String stClass) {
		this.stClass = stClass;
	}

	public car getCar() {
		return car;
	}

	public void setCar(car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "student [stId=" + stId + ", stName=" + stName + ", stClass=" + stClass + ", car=" + car + "]";
	}

	
	
	

}
