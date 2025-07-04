package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/","/css/**", "/js/**").permitAll() // ✅ Public pages and assets
                .anyRequest().authenticated() // 🔐 Secure all other pages
            )
            .formLogin(form -> form
                .loginPage("/login")  // Custom login page
                .permitAll()
            )
            .logout(logout -> logout.permitAll());

        return http.build();
    }
}
