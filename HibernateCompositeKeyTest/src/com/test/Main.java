package com.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ibs.training.hibernate.entity.HotelBooking;
import com.ibs.training.hibernate.entity.HotelBookingPK;
import com.ibs.training.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		HotelBooking booking = new HotelBooking();
		booking.setCustomerName("Suhail");
		booking.setAddress("Malappuram");
		
		HotelBookingPK hotelBookingPk = new HotelBookingPK();
		hotelBookingPk.setCustomerId(2001);
		hotelBookingPk.setHotelId(1001);
		
		booking.setHotelBBookingPK(hotelBookingPk);
		
		session.save(booking);
		
		tr.commit();
		session.close();
	}

}
