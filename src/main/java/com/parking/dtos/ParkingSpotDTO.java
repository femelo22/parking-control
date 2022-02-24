package com.parking.dtos;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ParkingSpotDTO {
	
	@NotBlank
	@JsonAlias("parking-spot-number")
	private String parkingSpotNumber;
	
	@NotBlank
	@JsonAlias("license-plate-car")
	private String licensePlateCar;
	
	@NotBlank
	@JsonAlias("brand-car")
	private String brandCar;
	
	@NotBlank
	@JsonAlias("model-car")
	private String modelCar;
	
	@NotBlank
	@JsonAlias("color-car")
	private String colorCar;
	
	@NotBlank
	@JsonAlias("responsible-name")
	private String responsibleName;

	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(String parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}

	public String getLicensePlateCar() {
		return licensePlateCar;
	}

	public void setLicensePlateCar(String licensePlateCar) {
		this.licensePlateCar = licensePlateCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}
	
	
}
