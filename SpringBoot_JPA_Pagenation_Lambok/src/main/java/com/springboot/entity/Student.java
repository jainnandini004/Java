package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data/*-----------------Lombok reduce the entity size by using annotations--------------------------------------*/
@Entity
public class Student {
	@Id
	private int id;
	private String firstname;
	private String lastname;
}



/*----------------Lombok Annotations------------------------------------------------------------------------------------------
 *
 * @ToString-> No need to start a debugger to see your fields: Just let lombok generate a toString for you!
 * 
 * @NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor-> Constructors made to order: Generates constructors that take no arguments,
 * one argument per final / non-nullfield, or one argument for every field.
 * 
 * @Data->All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all
 * non-final fields, and @RequiredArgsConstructor!
 */