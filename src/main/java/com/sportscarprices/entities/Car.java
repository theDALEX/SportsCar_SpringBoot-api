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
    private String car_maker;

    @Column(name = "car_model")
    private String car_model;

    @Column(name = "year")
    private Integer year;

    @Column(name = "engine_size")
    private String engine_size;

    @Column(name = "horsepower")
    private String horsepower;

    @Column(name = "torque")
    private String torque;

    @Column(name = "acceleration_zero_sixty")
    private String acceleration_zero_sixty;

    @Column(name = "price_usd")
    private String price_usd;

}
