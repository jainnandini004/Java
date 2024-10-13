package com.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*-----------------Configuration File using @Configuration and @Bean--------------------- */
//@Configuration
//public class AppConfig {
//
////	Two beans
//	@Bean
////	create object for samsung class
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	
//	@Bean
////	create object for MobileProcessor class
//	public MobileProcessor getProcessor()
//	{
////		SnapDragon create object for Mobile processor
//		return new SnapDragon();
//	}
//
//}


/*-----------------Configuration File using @ComponentScan------------------------------- */
@Configuration
@ComponentScan(basePackages = "com.spring") /* scan all component */
public class AppConfig {

}