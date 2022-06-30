package com.springboot.paytm.userdetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository repository;
	@Override
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(repository.count());
//		System.out.println("Service");
		User user = repository.findByUsername(username);
		System.out.println("hefw");
			System.out.println("abc" + user.getPassword());
			System.out.println(user.getUsername());
			System.out.println(user.getAuthorities());
//			System.Optional<User>out.println("Yes it is null");
//			return user.map(MyUserDetails::new).get();
		return new MyUserDetails(user);

	}
	
}
