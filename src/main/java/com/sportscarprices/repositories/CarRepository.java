package com.sportscarprices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportscarprices.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
