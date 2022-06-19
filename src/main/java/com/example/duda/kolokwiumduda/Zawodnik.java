package com.example.duda.kolokwiumduda;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Zawodnik {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "birthDate")
    private Date birthDate;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<Turniej> turniej;

    public Zawodnik(String firstName, String lastName, Date birthDate, List<Turniej> turniej) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.turniej = turniej;
    }

    public Zawodnik() {

    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
