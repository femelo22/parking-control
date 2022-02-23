package com.parking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.models.ParkingSpotModel;
import com.parking.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService implements IParkingSpotService {

	@Autowired
	private ParkingSpotRepository repository;
	
	@Override
	public void create(ParkingSpotModel model) {
		repository.save(model);
	}

}
