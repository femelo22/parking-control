package com.parking.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
