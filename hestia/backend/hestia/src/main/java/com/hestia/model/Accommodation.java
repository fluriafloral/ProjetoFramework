package com.hestia.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

enum Status {
    FREE, 
    OCCUPIED,
    UNCLEAN, 
    IN_MAINTENANCE
}

@Getter
@Setter
@Entity
public class Accommodation {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private AccCategory category;
    private Status status;
    private int occupation;
    private int maxOccupation;

}
