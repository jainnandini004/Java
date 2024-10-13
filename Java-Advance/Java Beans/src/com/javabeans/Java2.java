package com.javabeans;

public class Java2 {

	public static void main(String[] args) {
		Java1 obj=new Java1();
		obj.setId(74);
		obj.setName("Nandini");
		obj.setEmail("nandini.jain@soprasteria.com");
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getEmail());
	}

}
