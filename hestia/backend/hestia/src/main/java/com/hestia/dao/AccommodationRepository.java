package com.hestia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hestia.model.Accommodation;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long>{
    
}
