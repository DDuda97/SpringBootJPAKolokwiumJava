package com.example.duda.kolokwiumduda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rodzaj {
    @Id
    @GeneratedValue
    private Long id;
    private Type typ;


    public Rodzaj(Type typ) {
        this.typ = typ;
    }

    public Rodzaj() {
    }
}
