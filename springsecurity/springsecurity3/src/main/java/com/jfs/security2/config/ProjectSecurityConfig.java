package com.jfs.security2.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeHttpRequests()
				.requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
				.requestMatchers("/notices", "/contact", "/register").permitAll().and().formLogin(withDefaults())
				.httpBasic(withDefaults());

		return http.build();
	}

	/*
	 * since we are using costom table use dint use this
	 * 
	 * @Bean public UserDetailsService userDetailsService(DataSource dataSource) {
	 * 
	 * return new JdbcUserDetailsManager(dataSource); }
	 */

	/*
	 * f
	 * 
	 * @Bean public UserDetailsManager userDetailsService() {
	 * 
	 * @SuppressWarnings("deprecation") UserDetails admin =
	 * User.withUsername("kuchi").password("mohan").authorities("admin").build();
	 * 
	 * @SuppressWarnings("deprecation") UserDetails user =
	 * User.withUsername("mohan").password("kuchi").authorities("user").build();
	 * return new InMemoryUserDetailsManager(admin, user);
	 * 
	 * }
	 */

	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	/*
	 * @Bean public UserDetailsManager userDetailsService() {
	 * 
	 * UserDetails admin =
	 * User.withDefaultPasswordEncoder().username("kuchi").password("mohan").
	 * authorities("admin") .build(); UserDetails user =
	 * User.withDefaultPasswordEncoder().username("mohan").password("kuchi").
	 * authorities("user") .build(); return new InMemoryUserDetailsManager(admin,
	 * user);
	 * 
	 * }
	 */

}