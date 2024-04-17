package com.hestia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccCategoryDTO {
    
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private boolean active;
    private boolean acceptsChildren;
    private int maxNumberOfChildren;

}
