package com.hestia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hestia.model.Guest;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>{
    
}
