package com.hestia.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

enum Sex {
    MASCULINE,
    FEMININE, 
    NOT_INFORMED
}

enum Type {
    CPF, 
    PASSPORT,
    CNPJ
}

@Getter
@Setter
public abstract class Person {

    private String fullName;
    private String documentNumber;
    private Type documentType;
    private Sex sex;
    private LocalDate birthday;

}