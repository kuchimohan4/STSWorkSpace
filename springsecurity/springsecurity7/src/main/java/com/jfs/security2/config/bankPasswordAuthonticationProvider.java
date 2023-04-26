package com.jfs.security2.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.jfs.security2.models.Customer;
import com.jfs.security2.models.authorities;
import com.jfs.security2.repositry.CustomerRepository;

@Component
public class bankPasswordAuthonticationProvider implements AuthenticationProvider {

	@Autowired
	private CustomerRepository customerRepositry;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		List<Customer> customer = customerRepositry.findByEmail(username);
		if (customer.size() > 0) {
			if (passwordEncoder.matches(pwd, customer.get(0).getPwd())) {
//				List<GrantedAuthority> authorities = new ArrayList<>();
//				authorities.add(new SimpleGrantedAuthority(customer.get(0).getRole()));
				return new UsernamePasswordAuthenticationToken(username, pwd,
						getGrantedAuthorities(customer.get(0).getAuthorities()));
			} else {
				throw new BadCredentialsException("Invalid password");

			}
		} else {
			throw new BadCredentialsException("No user regesterd with this credentials");
		}
	}

	public List<GrantedAuthority> getGrantedAuthorities(Set<authorities> authoritie) {
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		for (authorities authorities2 : authoritie) {
			grantedAuthorities.add(new SimpleGrantedAuthority(authorities2.getName()));

		}
		return grantedAuthorities;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
