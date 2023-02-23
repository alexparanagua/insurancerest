package com.insurance.apirest.insurancerest.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Claims {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    private Cars car;

    @ManyToOne(cascade = CascadeType.ALL)
    private Drivers driver;

    @Column(name = "event_date")
    private Date dtEvent;
}
