package com.insurance.apirest.insurancerest.entity;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Insurances {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "creation_dt")
    private Timestamp dtCreate;
    
    @Column(name = "updated_at")
    private Timestamp dtUpdate;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cars cars;  
    
    @Column(name = "is_active")
    private boolean isActive;
}
