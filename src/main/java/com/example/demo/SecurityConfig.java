package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected  void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/teachers", "/managers")
                .access("hasRole('ROLE_USER')")
                .antMatchers("/", "/**").access("permitAll")
                .and().httpBasic();
    }
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
            .withUser("root")
            .password("{noop}1")
                .authorities("ROLE_USER")
                .and()
                .withUser("root2")
                .password("{noop}1")
                .authorities("ROLE_USER");
    }
}
