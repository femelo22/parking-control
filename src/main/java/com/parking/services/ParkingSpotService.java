package com.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.dtos.ParkingSpotDTO;
import com.parking.models.ParkingSpotModel;
import com.parking.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService implements IParkingSpotService {

	@Autowired
	private ParkingSpotRepository repository;
	
	
	public void create(ParkingSpotModel model) {
		repository.save(model);
	}

	public List<ParkingSpotModel> findAll() {
		return repository.findAll();
	}

	
	public void validationParkingSpot(ParkingSpotDTO dto) {
		
		if(existsByLicensePlateCar(dto.getLicensePlateCar())) {
			new Exception();
		}
		
		if(existsByParkingSpotNumber(dto.getParkingSpotNumber())) {
			new Exception();
		}
		
	}

	
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return repository.existsByLicensePlateCar(licensePlateCar);
	}

	
	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return repository.existsByParkingSpotNumber(parkingSpotNumber);
	}
	
	

}
