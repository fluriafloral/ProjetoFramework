package com.hestia.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

enum Origin {
    BOOKING, 
    EXPEDIA,
    WHATSAPP,
    INSTAGRAM, 
    OTHER
}

@Getter
@Setter
@Entity
public class Reserve {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Origin origin;
    private int adults;
    private int children;
    private Guest responsible;
    private List<Accommodation> accommodation;
    private Fare fare;

}
