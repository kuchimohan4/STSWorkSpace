package com.jfs.security2.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

		/*
		 * Custom security
		 */
        http.authorizeHttpRequests()
                .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards")
                .authenticated()
                .requestMatchers("/notices", "/contact")
                .permitAll()
                .and()
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
		
		/**
		 * Configuration to deny all the requests
		 *//*
			 * http.authorizeHttpRequests() 
			 * 		.anyRequest() 
			 * 		.denyAll() 
			 * 		.and()
			 * 		.formLogin(withDefaults()) 
			 * 		.httpBasic(withDefaults());
			 */

		/**
		 * Configuration to permit all the requests
		 *//*
			 * http.authorizeHttpRequests() 
			 * 		.anyRequest()
			 * 		.permitAll()
			 * 		.and()
			 * 		.formLogin(withDefaults())
			 * 		.httpBasic(withDefaults());
			 * 
			 * 
		*/
        
		/* Default
		*//*
		http.authorizeHttpRequests()
			.anyRequest().authenticated()
			.and()
			.formLogin(withDefaults())
			.httpBasic(withDefaults());
		*/
		return http.build();
	}
}