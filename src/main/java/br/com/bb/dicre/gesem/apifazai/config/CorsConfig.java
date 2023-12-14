package br.com.bb.dicre.gesem.apifazai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registro) {
		registro.addMapping("/**")
			.allowedOrigins("*")
			.allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "HEAD");
	}

}
