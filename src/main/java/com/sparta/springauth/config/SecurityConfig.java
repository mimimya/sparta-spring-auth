package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/",
                                "/api/user/signup",
                                "/api/user/login-page",
                                "/api/user/login",
                                "/js/basic.js",
                                "/css/style.css"
                        ).permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/user/login").permitAll()
                        .anyRequest().permitAll()
                ).formLogin(form -> form.disable());  // 기본 로그인 필터 끄기;

        return http.build();
    }
}