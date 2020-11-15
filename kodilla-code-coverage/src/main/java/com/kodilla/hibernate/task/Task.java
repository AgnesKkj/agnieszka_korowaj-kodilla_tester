package com.kodilla.hibernate.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

//Oznaczenie obiektu, który będzie mapowany do bazy po atrybutach
@Entity
//Odniesienie do tabeli
@Table(name = "TASKS")
public class Task {
    private int id;
    private String description;
    private LocalDate created;
    private int duration;

    //tak jak przy DTO tworzymy konstruktor ogólny oprócz konstruktora klasy
    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = LocalDate.now();
        this.duration = duration;
    }

    //tworzenie kolumny dla klucza pierwotnego
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    //tworzenie pozostałych kolumn
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @NotNull
    @Column(name = "CREATED")
    public LocalDate getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    //zestaw setterów
    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(LocalDate created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}