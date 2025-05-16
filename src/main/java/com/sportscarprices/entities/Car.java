package com.sportscarprices.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
     */

    public String getCarMakerTemp() {
        return carMaker;
    }

    public Integer getYearTemp() {
        return year;
    }

}
