package com.adginfosys.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan("com.adginfosys")
public class WebMvcConfig {
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean
	DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		
		//set the properties
		datasource.setUrl("jdbc:mysql://localhost/spring_2019");
		datasource.setUsername("root");
		datasource.setPassword("2727");
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		return datasource;
	}
	

}
