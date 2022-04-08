package com.ibs.training.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class HotelBookingPK implements Serializable {
	
	private int hotelId;
	private int customerId;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
