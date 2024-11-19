package com.rest.webservices.restful_web_services.security;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		// All Request Should be authenticated
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

		// If a request is not authenticated, web page is shown
		http.httpBasic(withDefaults());

		// CSRF -> post, put
		http.csrf().disable();

		return http.build();
	}

}
