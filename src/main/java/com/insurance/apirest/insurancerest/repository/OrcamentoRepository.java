package com.insurance.apirest.insurancerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.apirest.insurancerest.entity.Insurances;

@Repository
public interface OrcamentoRepository extends JpaRepository<Insurances, Long> {
    
}
