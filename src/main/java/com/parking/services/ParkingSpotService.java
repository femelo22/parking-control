package com.parking.services;

import java.util.List;

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

	public List<ParkingSpotModel> findAll() {
		return repository.findAll();
	}

}
