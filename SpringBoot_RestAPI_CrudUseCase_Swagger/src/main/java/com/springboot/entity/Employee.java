package com.springboot.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*-------Spring Boot Hateoas: It offers three abstractions for creating the URI – RepresentationModel, Link, and WebMvcLinkBuilder-----------*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee extends RepresentationModel<Employee> {
/*--------- a base class called RepresentationModel to inherit from when creating a resource representation.---------------------------------*/
	
	@Id
	private int id;
	private String name;
	private String department;
	

}
