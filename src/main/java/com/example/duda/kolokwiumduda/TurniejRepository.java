package com.example.duda.kolokwiumduda;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurniejRepository extends CrudRepository<Turniej, Long> {
}
