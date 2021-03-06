package com.parking.controllers;

import java.time.LocalDateTime;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.parking.dtos.ParkingSpotDTO;
import com.parking.models.ParkingSpotModel;
import com.parking.services.ParkingSpotService;

@RestController
@RequestMapping("/parking-spot")
public class ParkingSpotController {
	
	@Autowired
	ParkingSpotService service;
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity create(@RequestBody @Valid ParkingSpotDTO dto) {
		
		this.service.validationParkingSpot(dto);
		
		ParkingSpotModel model = new ParkingSpotModel();
		model.setRegistrationDate(LocalDateTime.now());
		
		BeanUtils.copyProperties(dto, model);
		
		this.service.create(model);
		
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	

}
