package com.hestia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FareDTO {
    
    private Long id;
    private String name;
    private double baseValue;
    private double increasePerGuest;
    private double increasePerChildren;
    private AccCategoryDTO accCategory;

}
