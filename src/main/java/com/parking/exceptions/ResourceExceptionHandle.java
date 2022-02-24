package com.parking.exceptions;


import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.parking.services.exceptions.ParkingSpotException;


@ControllerAdvice
public class ResourceExceptionHandle {

	@ExceptionHandler(ParkingSpotException.class)
	public ResponseEntity<StandardError> pokemonNotFound(ParkingSpotException e, HttpServletRequest request){
		
		StandardError error = new StandardError();
		error.setDate(LocalDateTime.now());
		error.setStatus(HttpStatus.CONFLICT.value());
		error.setError("Conflict");
		error.setMessage(e.getMessage());
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(error);		
	}
	
}
