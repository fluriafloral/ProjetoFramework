package com.hestia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hestia.model.Reserve;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Long>{
    
}
