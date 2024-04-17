package com.hestia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AccommodationDTO {

    private Long id;
    private String name;
    private AccCategoryDTO category;
    private int status;
    private int occupation;
    private int maxOccupation;
    
}
