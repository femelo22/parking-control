package com.parking.exceptions;


import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ResourceExceptionHandle {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<StandardError> pokemonNotFound(NotFoundException e, HttpServletRequest request){
		
		StandardError error = new StandardError();
		error.setDate(LocalDateTime.now());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setError("Not found.");
		error.setMessage(e.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);		
	}
	
}
