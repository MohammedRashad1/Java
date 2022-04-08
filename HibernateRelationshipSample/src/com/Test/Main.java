package com.Test;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;

import com.ibs.training.hibernate.entity.Booking;
import com.ibs.training.hibernate.entity.Hotel;
import com.ibs.training.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we will create a hotel with two bookings
		
		Hotel hotel=new Hotel();
		hotel.setHotelName("TAJ");
		hotel.setHotelLocation("COK");
		
		Booking booking1=new Booking();
		booking1.setBookingAMount(20000);
		booking1.setParentHotel(hotel);
		
		Booking booking2=new Booking();
		booking2.setBookingAMount(30000);
		booking2.setParentHotel(hotel);
		
		List<Booking> bookings=new ArrayList<>();
		bookings.add(booking1);
		bookings.add(booking2);
		
		hotel.setBookings(bookings);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		org.hibernate.Transaction tr=session.beginTransaction();
		
		session.save(hotel);
		
		
		tr.commit();
		session.close();
		
		
	}

}
