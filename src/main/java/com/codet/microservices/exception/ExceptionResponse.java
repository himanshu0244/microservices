package com.codet.microservices.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
	
	private Date timestamp;
	private String errorMessage;
	private Integer errorCode;
}
