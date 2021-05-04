package com.codet.microservices.user;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private Integer userId;

	@Size(min = 2, message = "name should have atleast 2 characters")
	@NotNull(message = "name can not be null")
	private String name;

	@Past
	@NotNull(message = "birth date can not be null")
	private Date dob;
}
