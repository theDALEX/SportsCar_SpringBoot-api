package com.sportscarprices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sportscarprices.entities.Car;
import com.sportscarprices.services.CarServices;

@RestController
@RequestMapping(path = "cars")
public class CarController {

    private final CarServices carServices;

    @Autowired
    public CarController(CarServices carServices) {
        this.carServices = carServices;
    }

    @GetMapping
    public List<Car> getCars(
            @RequestParam(required = false) Integer year,
            @RequestParam(required = false) String carMaker) {

        if (year != null) {
            return carServices.getCarsByYear(year);
        } else if (carMaker != null) {
            return carServices.getCarByCarMaker(carMaker);
        } else {
            return carServices.getAllCars();
        }
    }

}
