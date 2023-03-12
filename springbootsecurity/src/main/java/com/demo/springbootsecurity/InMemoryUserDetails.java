package com.demo.springbootsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class InMemoryUserDetails  {    
 
	@Bean
	public UserDetailsService users() {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails user    = users
				
				.username("rahul")
				.password("rahul")
				.roles("USER")
				.build();
		UserDetails admin = users
				.username("admin")
				.password("admin")
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user,admin);
	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();         //when i try to include this it is saying bad credentials while entering username, password.
//
//	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception       //securityFilterChain() this name can be anything.
	{
		http.authorizeRequests()
				.requestMatchers("/admin").hasRole("ADMIN")
				.requestMatchers("/user").hasAnyRole("USER","ADMIN")    //spring security doesnt know that it is admin ,when you dont include admin ad use hasrole() with only user, when you access url we cannot access admin , bcz spring security doesnt konw that .To make it known to spring we have to use hasAnyRole() and also add admin along with the user.
				.requestMatchers("/").permitAll()
				.and().formLogin();
		return http.build();
			
				
	}
	

}	
