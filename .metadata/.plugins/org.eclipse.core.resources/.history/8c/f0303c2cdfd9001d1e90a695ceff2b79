package com.springboot.student;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securitycofig extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// we can set config in auth
		auth.inMemoryAuthentication()
		.withUser("kuchi")
		.password("mohan")
		.roles("admin")
		.and()
		.withUser("tharuny")
		.password("th")
		.roles("user");
		//we can add as many users as we want
		
	}
	
	//this is for password decoding we are using no op which means planin text if hashed then we can use different type of encoding
	@Bean
	public PasswordEncoder passwordEncode() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/students").hasAnyRole("user","admin")
		.antMatchers("/students/**").hasRole("user")
		.antMatchers("/hello").permitAll()
		.and().formLogin();
	}
	

}
