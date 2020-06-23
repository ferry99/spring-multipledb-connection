package io.ferry.my.user.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.ferry.my.user.data.UserDetails;

public interface UserDao extends JpaRepository<UserDetails, Long> {
	
	UserDetails findByEmail(String email);
	
}