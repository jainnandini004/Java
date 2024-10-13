package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotation.AppConfig;
import com.spring.annotation.Samsung;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s=context.getBean(Samsung.class);
        s.config();
    }
}
