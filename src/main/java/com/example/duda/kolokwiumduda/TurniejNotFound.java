package com.example.duda.kolokwiumduda;

public class TurniejNotFound extends RuntimeException {

    TurniejNotFound(Long id) {
        super("Could not Turniej " + id);
    }
}
