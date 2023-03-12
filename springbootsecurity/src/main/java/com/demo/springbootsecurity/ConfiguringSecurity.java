//package com.demo.springbootsecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
////
////@Configuration
////@EnableWebSecurity
//////@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ConfiguringSecurity extends WebSecurityConfiguration {
////
////	@Bean
////	public void configure(AuthenticationManagerBuilder auth) throws Exception {
////
////////		http 
////////				.csrf().disable()
////////				.authorizeHttpRequests( (authz) -> authz.anyRequest().authenticated())
////////				.httpBasic(Customizer.withDefaults())
////////				.userDetailsService((UserDetailsService) homeResource);
////////		return http.build();
//////				
//////	   http
//////	   			
//////	   			.authorizeHttpRequests()
//////	   			.anyRequest()
//////	   			.authenticated()
//////	   			.and()
//////	   			.httpBasic();
//////	   return http.build();
////		auth.inMemoryAuthentication()
////		.withUser("rahul")
////		.password("rahul")
////		.roles("user");
////
////		auth.inMemoryAuthentication().withUser("rahul").password("rahul").roles("USER");
////
////	}
////
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////		return new BCryptPasswordEncoder();
//	
////	}
//	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
//	{
//		http.authorizeRequests()
//				.requestMatchers("/**").hasRole("USER")
//				.and().formLogin();
//		return http.build();
//			
//				
//	}
//	
//	
//
//}
