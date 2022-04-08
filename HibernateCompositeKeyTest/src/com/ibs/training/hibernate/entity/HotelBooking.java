package com.ibs.training.hibernate.entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LITMUSNOV2021HOTELBOOKING")
public class HotelBooking {
	
	@EmbeddedId
	private HotelBookingPK hotelBBookingPK;
	private String address,customerName;

	public HotelBookingPK getHotelBBookingPK() {
		return hotelBBookingPK;
	}

	public void setHotelBBookingPK(HotelBookingPK hotelBBookingPK) {
		this.hotelBBookingPK = hotelBBookingPK;
	}

	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="CUSTOMERNAME")
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	
	
}
