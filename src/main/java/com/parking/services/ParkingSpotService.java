package com.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.dtos.ParkingSpotDTO;
import com.parking.models.ParkingSpotModel;
import com.parking.repositories.ParkingSpotRepository;
import com.parking.services.exceptions.ParkingSpotException;

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
		if(existsByParkingSpotNumber(dto.getParkingSpotNumber())) {
			throw new ParkingSpotException("Conflict: Parking Spot is already in use!");
		}
		
		if(existsByLicensePlateCar(dto.getLicensePlateCar())) {
			throw new ParkingSpotException("Conflict: License Plate Car is already in use!");
		}
	}

	
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return repository.existsByLicensePlateCar(licensePlateCar);
	}

	
	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return repository.existsByParkingSpotNumber(parkingSpotNumber);
	}
	
	

}
