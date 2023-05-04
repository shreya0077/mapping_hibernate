package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class car {
	
	
	@Id
	private int carId;
	private String carName;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "car [carId=" + carId + ", carName=" + carName + "]";
	}
	
	
	

}
