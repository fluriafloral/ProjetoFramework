package com.hestia.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {

    private String fullName;
    private String documentNumber;
    private DocumentType documentType;
    private PersonSex sex;
    private LocalDate birthday;

}