package com.springboot.paytm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.paytm.department.DepartmentRepository;
import com.springboot.paytm.employee.EmployeeRepository;
import com.springboot.paytm.jwtutils.JwtUtils;
import com.springboot.paytm.models.AuthRequest;
import com.springboot.paytm.models.AuthResponse;
import com.springboot.paytm.userdetails.MyUserDetailsService;
import com.springboot.paytm.userdetails.UserRepository;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@RestController
@EnableJpaRepositories(basePackageClasses = UserRepository.class)

public class MainApp {
	
	public static void main(String[] args) {
		
		SpringApplication.run(MainApp.class, args);

	}
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	MyUserDetailsService detailsService;
	@Autowired
	JwtUtils jwtUtils;
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthRequest authenticationRequest) {

		try {
			System.out.println("Succeess");
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
			);
			
		}
		catch (BadCredentialsException e) {
			System.out.println("Credentials not matching to the Database");
			
		}

		System.out.println("In Mainapp");
		final UserDetails userDetails = detailsService
				.loadUserByUsername(authenticationRequest.getUsername());
		final String jwt = jwtUtils.generateToken(userDetails);

		return ResponseEntity.ok(new AuthResponse(jwt));
	}

	

}
