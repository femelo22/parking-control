package com.parking.services.exceptions;

public class ParkingSpotException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ParkingSpotException(String msg) {
		super(msg);
	}

}
