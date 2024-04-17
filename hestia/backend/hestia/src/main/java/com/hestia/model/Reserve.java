package com.hestia.model;

import java.time.LocalDate;
import java.util.List;

import com.hestia.model.enums.ReserveOrigin;

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
@Table(name = "reserves")
public class Reserve {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate checkIn;
    private LocalDate checkOut;
    private ReserveOrigin origin;
    private int adults;
    private int children;
    private Guest responsible;
    private List<Accommodation> accommodation;
    private Fare fare;

}
