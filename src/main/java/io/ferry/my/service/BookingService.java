package io.ferry.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ferry.my.booking.repo.BookingDao;
import io.ferry.my.user.data.UserDetails;
import io.ferry.my.user.repo.UserDao;

@Service
public class BookingService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BookingDao bookingDao;

	public List findUserBookings(String emailId) {
//		UserDetails userdetails = userDao.findByEmail(emailId);
		List bookings = bookingDao.findByCreatedBy(1L);
		return bookings;
	}
}
