package com.hestia.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Getter
@Setter
public class Accommodation {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
