package com.insurance.apirest.insurancerest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;


@Data
@Entity
@Table(name = "car_drivers")
public class CarDrivers {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    private Cars car;

    @ManyToOne(cascade = CascadeType.ALL)
    private Drivers driver;

    @Column(name = "is_main_driver")
    private boolean isMainDriver;
}
