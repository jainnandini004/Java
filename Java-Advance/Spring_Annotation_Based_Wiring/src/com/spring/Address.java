package com.spring;

import java.io.Serializable;

public class Address implements Serializable {
	private String cityname;
	private String statename;
	private String countryname;
	
	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityname + ", stateName=" + statename + ", countryName=" + countryname + "]";
	}
}