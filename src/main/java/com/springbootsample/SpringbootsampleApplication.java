package com.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringbootsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsampleApplication.class, args);
	}

}
