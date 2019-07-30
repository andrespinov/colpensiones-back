package com.colpensiones.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class IndependentWorkerNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(IndependentWorkerNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(IndependentWorkerNotFoundException ex) {
		return ex.getMessage();
	}
}
