package com.parking.dtos;

import javax.validation.constraints.NotBlank;

public class ParkingSpotDTO {
	
	
	@NotBlank
	private String parkingSpotNumber;
	
	@NotBlank
	private String licensePlateCar;
	
	@NotBlank
	private String brandCar;
	
	@NotBlank
	private String modelCar;
	
	@NotBlank
	private String colorCar;
	
	@NotBlank
	private String responsibleName;

}
