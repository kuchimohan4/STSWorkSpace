package com.jfs.security2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jfs.security2.custmor.Customer;
import com.jfs.security2.repositry.CustomerRepositry;

@RestController
public class LoginController {

	@Autowired
	CustomerRepositry customerRepositry;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody Customer customer) {

		Customer savedCustomer = null;
		ResponseEntity response = null;
		try {
			savedCustomer = customerRepositry.save(customer);
			if (savedCustomer.getId() > 0) {
				response = ResponseEntity.status(HttpStatus.CREATED)
						.body("geven user details are sucessfully registred");
				System.out.println("gdfsdvjhs");

			}
		} catch (Exception e) {

			response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("an exception occured due to" + e.getMessage());
		}

		return response;
	}

}
