package com.aviral.SpringOauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
         http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());   // authenticate all requests
         http.oauth2Login(Customizer.withDefaults());   //using Oauth-2 login
        return http.build();
    }
}
