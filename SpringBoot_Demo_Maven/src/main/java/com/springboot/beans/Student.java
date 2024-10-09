package com.springboot.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	

	private int stid;
	private String stname;
	
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public Student() {
		
	}
	
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + "]";
	}

}
