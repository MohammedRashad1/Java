package com.ibs.training.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="LITMUSNOV2021BOOKING")
public class Booking {

	@Id
	@GenericGenerator(name="bookingIDGenerator",strategy="increment")
	@GeneratedValue(generator="bookingIDGenerator",strategy=GenerationType.AUTO)
	@Column(name="BOOKINGID",length=5)
	private int bookingId;
	
	@Column(name="BOOKINGAMOUNT",precision=8,scale=2)
	private double bookingAMount;
	
	@ManyToOne
	@JoinColumn(name="HOTELID")
	private Hotel parentHotel;
	
	public double getBookingAMount() {
		return bookingAMount;
	}

	public void setBookingAMount(double bookingAMount) {
		this.bookingAMount = bookingAMount;
	}

	public Hotel getParentHotel() {
		return parentHotel;
	}

	public void setParentHotel(Hotel parentHotel) {
		this.parentHotel = parentHotel;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	
	
	
}
