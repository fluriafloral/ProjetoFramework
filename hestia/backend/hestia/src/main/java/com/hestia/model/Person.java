package com.hestia.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

enum Sex {
    MASCULINE,
    FEMININE, 
    NOT_INFORMED
}

@Getter
@Setter
public abstract class Person {

    private String name;
    private String surName;
    private Document document;
    private Sex sex;
    private LocalDate birthday;

}