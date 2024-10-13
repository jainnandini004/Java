package com.example;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	//In order our application able to define which local is currently in use we need to add LocalResolver bean. 
	@Bean
	public LocaleResolver localeResolver() {
		//session-based resolver SessionLocaleResolver and set a default locale
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(new Locale("en", "US"));
		return sessionLocaleResolver;
	}
	
	//make our application to switch on to the new local as per the value of language parameter present on the request.
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor localeChangeInterceptor=new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("language");
	return localeChangeInterceptor;
	}
	
	//MessageSource implementation that accesses resource bundles using specified basenames. Using this we can customize the base name of resource bundle.
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource bundleMessageSource=new ResourceBundleMessageSource();
		bundleMessageSource.addBasenames("msg");
		bundleMessageSource.setDefaultEncoding("UTF-8");
		return bundleMessageSource;
	}
}
