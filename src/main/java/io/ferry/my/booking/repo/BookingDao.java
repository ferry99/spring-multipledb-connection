package io.ferry.my.booking.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import io.ferry.my.booking.data.Booking;
import io.ferry.my.user.data.UserDetails;

public interface BookingDao  extends JpaRepository<Booking, Long>{
	
	List findByCreatedBy(Long userId);

}