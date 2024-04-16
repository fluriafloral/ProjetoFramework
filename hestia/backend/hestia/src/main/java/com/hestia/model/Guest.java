package com.hestia.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Getter
@Setter
@Entity
@Table(name = "guests")
public class Guest extends Person{

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String telephone;
    private String zipCode;
    private String address;
    private String city;

}
