package com.example.duda.kolokwiumduda;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TurniejController {
    private final TurniejRepository repository;

    TurniejController(TurniejRepository repository) {
        this.repository = repository;
    }

    //lista zawodnikow
    @GetMapping("/turnieje")
    List<Turniej> all() {
        return (List<Turniej>) repository.findAll();
    }
    //jeden zawodnik
    @GetMapping("/turniej/{id}")
    Turniej one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new TurniejNotFound(id));
    }
}
