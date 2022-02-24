package com.parking.services;

import java.util.List;

import com.parking.dtos.ParkingSpotDTO;
import com.parking.models.ParkingSpotModel;

public interface IParkingSpotService {

	public void create(ParkingSpotModel model);
	
	public List<ParkingSpotModel> findAll();
	
	public void validationParkingSpot(ParkingSpotDTO dto);
	
	public boolean existsByLicensePlateCar(String licensePlateCar);
	
	public boolean existsByParkingSpotNumber(String parkingSpotNumber);
	
}
