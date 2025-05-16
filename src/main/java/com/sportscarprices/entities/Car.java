package com.sportscarprices.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sportscarprices")
public class Car {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "car_maker")
    private String carMaker;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "year")
    private Integer year;

    @Column(name = "engine_size")
    private String engineSize;

    @Column(name = "horsepower")
    private String horsepower;

    @Column(name = "torque")
    private String torque;

    @Column(name = "acceleration_zero_sixty")
    private String accelerationZeroSixty;

    @Column(name = "price_usd")
    private String priceUsd;

    /*
     * to fix the error from ./mvnw.cmd clean package
     * [ERROR] Failed to execute goal
     * org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile
     * (default-compile) on project sportscarprices: Compilation failure:
     * Compilation failure:
     * [ERROR]
     * /D:/java_learn/SpringBoot/sportscarprices&info/sportsCarPrices_Backend/
     * sportscarprices/src/main/java/com/sportscarprices/services/CarServices.java:[
     * 27,51] cannot find symbol
     * [ERROR] symbol: method getCarMaker()
     * [ERROR] location: variable car of type com.sportscarprices.entities.Car
     * [ERROR]
     * /D:/java_learn/SpringBoot/sportscarprices&info/sportsCarPrices_Backend/
     * sportscarprices/src/main/java/com/sportscarprices/services/CarServices.java:[
     * 33,47] cannot find symbol
     * [ERROR] symbol: method getYear()
     * [ERROR] location: variable car of type com.sportscarprices.entities.Car
     * [ERROR] -> [Help 1]
     * 
     * the error doesnt make sense . i think its becasue of the lombok not syncying
     * to set @getter and @setters
     * so trying manually
     * 
     * after the jar is made and docker file the api i snot working as expected
     * 
     * the intuation was right the issues was fixed when manualy write arg and no
     * args constructor
     * saem with setter ans getter
     */

    // Constructor without parameters
    public Car() {
    }

    // Constructor with parameters
    public Car(Integer id, String carMaker, String carModel, Integer year, String engineSize, String horsepower,
            String torque, String accelerationZeroSixty, String priceUsd) {
        this.id = id;
        this.carMaker = carMaker;
        this.carModel = carModel;
        this.year = year;
        this.engineSize = engineSize;
        this.horsepower = horsepower;
        this.torque = torque;
        this.accelerationZeroSixty = accelerationZeroSixty;
        this.priceUsd = priceUsd;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getAccelerationZeroSixty() {
        return accelerationZeroSixty;
    }

    public void setAccelerationZeroSixty(String accelerationZeroSixty) {
        this.accelerationZeroSixty = accelerationZeroSixty;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd;
    }
}
