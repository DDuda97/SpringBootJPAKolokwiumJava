package com.example.duda.kolokwiumduda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class KolokwiumDudaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KolokwiumDudaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ZawodnikRepository repository){
        return(args -> {
            insertZawodnik(repository);
            System.out.println(repository.findAll());
        });
    }
    //dodawanie zawodnika

    @PostConstruct
    private void insertZawodnik(ZawodnikRepository repository){
        Rodzaj r1 = new Rodzaj(Type.singiel);
        Turniej t1 = new Turniej("Plonaca Paletka",r1);
        Turniej t2 = new Turniej("Latajaca Pileczka",r1);
        Zawodnik z1 = new Zawodnik("Denis","Duda",new Date(1997,07,29), List.of(t1,t2));
        repository.save(z1);
        //repository.save(new Zawodnik("Denis","Duda",new Date(1997,07,29),new Turniej("Rakietki")));
        //repository.save(new Zawodnik("Bartosz","Adamski",new Date(2002,02,1), new Turniej("Rakietki")));
       // repository.save(new Zawodnik("Mateusz","Ferdyn",new Date(2000,04,3), new Turniej("Rakietki")));
       // repository.save(new Zawodnik("Tomasz","Listewski",new Date(1997,02,11), new Turniej("Rakietki")));

    }
/*
    @Bean
    public CommandLineRunner run(TurniejRepository turniej_repository){
        return(args -> {
            insertTurniej(turniej_repository);
            System.out.println(turniej_repository.findAll());
        });
    }
    //dodawanie zawodnika


    private void insertTurniej(TurniejRepository turniej_repository){
        turniej_repository.save(new Turniej("Szaloni Tenisiarze"));
        turniej_repository.save(new Turniej("Tenisowe Przygody"));
        turniej_repository.save(new Turniej("Szalone Rakiety"));
        turniej_repository.save(new Turniej("Zwariowane pileczki"));
    }

     */
}
