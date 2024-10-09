package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class internationalizerConfig implements WebMvcConfigurer {

	@Autowired
	LocaleChangeInterceptor localeChangeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor);
	}
	/*
	 * spring boot search for the message file at src/main/resources containing
	 * internationalization keys and values, Typically files for each local will be
	 * name as messages_xx.properties where xx is the local code we need to define a
	 * fallback file named as messages.properties The default locale is the locale
	 * to default to when the requested locale is unavailable, or null. On the other
	 * hand, the fallback file is a place to look up properties when the locale
	 * translation fails.
	 */

}
