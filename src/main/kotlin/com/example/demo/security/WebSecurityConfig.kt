package com.example.demo.security

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter


class WebSecurityConfig: WebSecurityConfigurerAdapter() {
    @Throws(java.lang.Exception::class)
    override fun configure(http: HttpSecurity) {
        http
            .authorizeRequests()
            .antMatchers("/", "/home").permitAll()
            .anyRequest().authenticated()
        http
            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .logout()
            .permitAll()
    }

     class AuthenticationConfiguration : GlobalAuthenticationConfigurerAdapter() {

         @Override
         override fun init(auth: AuthenticationManagerBuilder) {
             auth
                 .inMemoryAuthentication()
                 .withUser("user").password("password").roles("USER");
         }

     }
}