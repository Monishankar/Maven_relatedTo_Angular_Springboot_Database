package org.springframework.security.config.annotation.web.configuration.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



   
@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter{ 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
			http.csrf().disable();
			http.authorizeRequests()
			.antMatchers(HttpMethod.OPTIONS,"/*").permitAll()
			.anyRequest().authenticated()
				.and()
				//.formLogin().and()
			.httpBasic();
			
	}
}
