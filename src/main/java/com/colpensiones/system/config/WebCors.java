package com.colpensiones.system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebCors implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedHeaders("*")
				.allowedOrigins("http://localhost:4200", "https://colpensiones-frontend.herokuapp.com")
				.allowedMethods("GET", "POST", "PUT");
	}
}
