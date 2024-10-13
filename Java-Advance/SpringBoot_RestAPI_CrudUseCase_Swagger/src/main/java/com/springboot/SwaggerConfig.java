package com.springboot;

/*------------------------Swagger Configuration File--------------------------------------*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//needed two dependency for swagger these are-springfox-swagger2 and springfox-swagger-ui
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2);
	}

}

/*
 * Swagger2 
 * swagger2 is an open source project used to generate the REST API documents for RESTful web services. 
 * It provides a user interface to access our RESTful web services via the web browser.
 * 
 * To check swagger documentation for our application, pass below url in thebrowser- 
 * http://localhost:2026/swagger-ui.html
 */