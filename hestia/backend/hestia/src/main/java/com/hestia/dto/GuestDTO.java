package com.hestia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GuestDTO {
    
    private Long id;
    private String fullName;
    private String documentNumber;
    private int documentType;
    private int sex;
    private String birthday;
    private String telephone;
    private String zipCode;
    private String address;
    private String city;

}
