package com.ibs.training.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="LITMUSNOV2021HOTEL")
public class Hotel {

	@Id
	@GenericGenerator(name="hotelIDGenerator",strategy="increment")
	@GeneratedValue(generator="hotelIDGenerator",strategy=GenerationType.AUTO)
	@Column(name="HOTELID",length=5)
	private int hotelId;
	
	@Column(name="HOTELNAME",length=10)
	private String hotelName;
	
	@Column(name="HOTELLOCATION",length=10)
	private String hotelLocation;
	
	@OneToMany(mappedBy="parentHotel",cascade=CascadeType.ALL)
	//mappedBy is applicable only when you have bi-directional relationship
	private List<Booking> bookings;
	
	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	
	
	
}
