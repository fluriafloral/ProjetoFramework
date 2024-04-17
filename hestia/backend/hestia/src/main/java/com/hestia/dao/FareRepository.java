package com.hestia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hestia.model.Fare;

@Repository
public interface FareRepository extends JpaRepository<Fare, Long>{
    
}
