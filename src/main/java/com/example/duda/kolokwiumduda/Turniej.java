package com.example.duda.kolokwiumduda;
import javax.persistence.*;

@Entity
public class Turniej {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Rodzaj rodzaj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Turniej() {}
    public void setRodzaj(Rodzaj r1){
        this.rodzaj = r1;
    }
    public Turniej(String name,Rodzaj r1) {
        this.name = name;
        this.rodzaj = r1;
    }

    @Override
    public String toString() {
        return "Turniej{" +
                "name='" + name + '\'' +
                '}';
    }
}
