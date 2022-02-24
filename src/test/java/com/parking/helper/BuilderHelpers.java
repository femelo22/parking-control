package com.parking.helper;

import java.time.LocalDateTime;
import java.util.UUID;

import com.parking.models.ParkingSpotModel;

public class BuilderHelpers {
	
	
	public static ParkingSpotModel buildParkingSlot() {
		
		ParkingSpotModel model = new ParkingSpotModel(
				UUID.randomUUID(),
				"teste",
				"teste",
				"teste",
				"teste",
				"teste",
				LocalDateTime.now(),
				"teste");
		
		return model;
	}

}
