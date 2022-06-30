package com.springboot.paytm.userdetails;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
	
	User findByUsername(String username);
	
}
