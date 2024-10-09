package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*-----------------Configuration File using @Configuration and @Bean--------------------- */
//public class Samsung {
//
//	@Autowired
////	Samsung class depend on MobileProcessor class
//	MobileProcessor cpu;
//	
//	public MobileProcessor getCpu() {
//		return cpu;
//	}
//
//	public void setCpu(MobileProcessor cpu) {
//		this.cpu = cpu;
//	}
//
//	public void config()
//	{
//		System.out.println("Octa Core 4, Gb Ram, 12MP Camera");
//		cpu.process();
//	}
//}

///*-----------------Configuration File using @ComponentScan------------------------------- */
//@Component//Bydefault this @Component("samsung")
//public class Samsung {
//	
//	@Autowired
////	Samsung class depend on MobileProcessor class
//	MobileProcessor cpu;
//	
//	public MobileProcessor getCpu() {
//		return cpu;
//	}
//
//	public void setCpu(MobileProcessor cpu) {
//		this.cpu = cpu;
//	}
//
//	public void config()
//	{
//		System.out.println("Octa Core 4, Gb Ram, 12MP Camera");
//		cpu.process();
//	}
//}

/*-----------------Configuration File using @ComponentScan and @Qualifier to remove confusion------------------------------- */
@Component//Bydefault this @Component("samsung")
public class Samsung {
	
	@Autowired
//	Samsung class depend on MobileProcessor class
	@Qualifier("mediaTek")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("Octa Core 4, Gb Ram, 12MP Camera");
		cpu.process();
	}
}