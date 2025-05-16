package com.sportscarprices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sportscarprices.entities.Car;
import com.sportscarprices.repositories.CarRepository;

@Component
public class CarServices {
    private final CarRepository carRepository;

    @Autowired
    public CarServices(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public List<Car> getCarByCarMaker(String carMaker) {
        return carRepository.findAll().stream()
                .filter(car -> carMaker.equals(car.getCarMaker()))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByYear(Integer year) {
        return carRepository.findAll().stream()
                .filter(car -> year.equals(car.getYear()))
                .collect(Collectors.toList());
    }
}
