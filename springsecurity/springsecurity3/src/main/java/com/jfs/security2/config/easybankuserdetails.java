package com.jfs.security2.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jfs.security2.custmor.Customer;
import com.jfs.security2.repositry.CustomerRepositry;

@Service
public class easybankuserdetails implements UserDetailsService {

	@Autowired
	CustomerRepositry customerRepositry;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub

		String userName, password = null;
		List<GrantedAuthority> authorities = new ArrayList<>();
		List<Customer> customer = customerRepositry.findByEmail(username);
		if (customer.size() == 0) {
			throw new UsernameNotFoundException("USer details not found for the user" + username);
		} else {
			username = customer.get(0).getEmail();
			password = customer.get(0).getPwd();
			authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
		}

		return new User(username, password, authorities);
	}

}
