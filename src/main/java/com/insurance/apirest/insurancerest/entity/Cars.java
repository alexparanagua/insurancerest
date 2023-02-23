package com.insurance.apirest.insurancerest.entity;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Cars {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "model_car")
    private String model;

    private String manufacturer;

    @Column(name = "year_car")
    private int year;

    @Column(name = "fipe_value")
    private BigDecimal valueFipe;

    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private Set<CarDrivers> cardrivers;

    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private Set<Claims> claims;
}
