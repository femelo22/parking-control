package com.parking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.parking.dtos.ParkingSpotDTO;
import com.parking.services.ParkingSpotService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/parking-spot")
public class ParkingSpotController {
	
	@Autowired
	ParkingSpotService service;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity create(@RequestBody ParkingSpotDTO dto) {
		
		this.service.create(null);
		
		return ResponseEntity.ok().build();
	}

}
