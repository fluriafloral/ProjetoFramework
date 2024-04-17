package com.hestia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hestia.model.AccCategory;

@Repository
public interface AccCategoryRepository extends JpaRepository<AccCategory, Long>{
    
}
