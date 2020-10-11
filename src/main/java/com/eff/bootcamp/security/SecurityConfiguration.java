package com.eff.bootcamp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Admin").password("admin").roles("Admin").and()
		.withUser("User").password("user").roles("User");
	}
	
	@Bean
	public PasswordEncoder GetPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}

//@Configuration
//@EnableWebSecurity
//public class MyWebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring()
//		// Spring Security should completely ignore URLs starting with /resources/
//				.antMatchers("/resources/**");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/public/**").permitAll().anyRequest()
//				.hasRole("USER").and()
//				// Possibly more configuration ...
//				.formLogin() // enable form based log in
//				// set permitAll for all URLs associated with Form Login
//				.permitAll();
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//		// enable in memory based authentication with a user named "user" and "admin"
//		.inMemoryAuthentication().withUser("user").password("password").roles("USER")
//				.and().withUser("admin").password("password").roles("USER", "ADMIN");
//	}
//
//	// Possibly more overridden methods ...
//}
