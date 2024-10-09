package com.spring.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*-----------------Configuration File using @Configuration and @Bean-------------------------------- */
//public class SnapDragon implements MobileProcessor{
//
//	public void process()
//	{
//		System.out.println("World Best CPU");
//	}
//}


/*---------------Configuration File using @ComponentScan and @Primary to remove confusion------------------ */
//@Component
//@Primary
//public class SnapDragon implements MobileProcessor{
//
//	public void process()
//	{
//		System.out.println("World Best CPU");
//	}
//}


/*---------------Configuration File using @ComponentScan and @Qualifer------------------------------------- */
@Component
public class SnapDragon implements MobileProcessor{

	public void process()
	{
		System.out.println("World Best CPU");
	}
}