package br.com.bb.dicre.gesem.apifazai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApifazaiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApifazaiApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApifazaiApplication.class);
	}

}
