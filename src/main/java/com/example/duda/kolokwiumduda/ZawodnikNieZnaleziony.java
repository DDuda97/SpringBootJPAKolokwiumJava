package com.example.duda.kolokwiumduda;

public class ZawodnikNieZnaleziony  extends RuntimeException {

    ZawodnikNieZnaleziony(Long id) {
        super("Could not find Zawodnik " + id);
    }
}