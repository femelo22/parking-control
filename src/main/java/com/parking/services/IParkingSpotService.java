package com.parking.services;

import java.util.List;

import com.parking.models.ParkingSpotModel;

public interface IParkingSpotService {

	public void create(ParkingSpotModel model);
	
	public List<ParkingSpotModel> findAll();
	
}
