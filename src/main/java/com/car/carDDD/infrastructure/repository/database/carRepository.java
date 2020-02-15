package com.car.carDDD.infrastructure.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.carDDD.infrastructure.dto.carDto;

public interface carRepository extends JpaRepository<carDto, String>{

}
