package com.hestia.model;

import lombok.Getter;
import lombok.Setter;

enum Type {
    CPF, 
    PASSPORT,
    CNPJ
}

@Getter
@Setter
public class Document {

    private String number;
    private Type documentType;

}
