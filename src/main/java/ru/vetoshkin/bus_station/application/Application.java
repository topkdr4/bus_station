package ru.vetoshkin.bus_station.application;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;





/**
 * Ветошкин А.В. РИС-16бзу
 * */
@SpringBootApplication
@ComponentScan(basePackages="ru.vetoshkin.bus_station.*")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	/*
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		ServletRegistrationBean servlet = new ServletRegistrationBean(new CamelHttpTransportServlet(), contextPath + "/*");
		servlet.setName("CamelServlet");
		return servlet;
	}*/
}
