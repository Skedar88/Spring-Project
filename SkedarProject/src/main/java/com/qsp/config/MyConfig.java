package com.qsp.config;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = "com.qsp")
public class MyConfig {
	@Bean
	public EntityManager getEM() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}

}
