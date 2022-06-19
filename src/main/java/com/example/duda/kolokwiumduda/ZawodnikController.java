package com.example.duda.kolokwiumduda;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
public class ZawodnikController {
    final ZawodnikRepository repository;

    ZawodnikController(ZawodnikRepository repository) {
        this.repository = repository;
    }

    //lista zawodnikow
        @GetMapping ( "/zawodnicy")
        public List<Zawodnik> all() {
            return (List<Zawodnik>) repository.findAll();
    }
    //jeden zawodnik
    @GetMapping("/zawodnik/{id}")
    Zawodnik one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ZawodnikNieZnaleziony(id));
    }

    //usun
    @DeleteMapping("/zawodnikdelete/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/newzawodnik")
    Zawodnik newZawodnik(@RequestBody Zawodnik newEmployee) {
        return repository.save(newEmployee);
    }
}