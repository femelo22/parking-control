package com.parking.services;

import static com.parking.helper.BuilderHelpers.buildParkingSlot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.parking.models.ParkingSpotModel;
import com.parking.repositories.ParkingSpotRepository;

import io.mockk.impl.annotations.InjectMockKs;
import io.mockk.impl.annotations.MockK;
import io.mockk.junit5.MockKExtension;

@ExtendWith(MockKExtension.class)
@MockK()
public class ParkingSlotServiceTest {
	
	@InjectMockKs
	private ParkingSpotRepository repository;
	
	
	@Test
	public void should_create_parking_slot(){
		
		ParkingSpotModel parkingSlotFake = buildParkingSlot();
		
		
	}
	

}
