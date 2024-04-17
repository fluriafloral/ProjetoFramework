package com.hestia.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReserveDTO {

    private Long id;
    private String checkIn;
    private String checkOut;
    private int origin;
    private int adults;
    private int children;
    private GuestDTO responsible;
    private List<AccommodationDTO> accommodation;
    private FareDTO fare;
    
}
