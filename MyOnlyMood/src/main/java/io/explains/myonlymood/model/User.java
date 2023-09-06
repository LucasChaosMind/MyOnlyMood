package io.explains.myonlymood.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class User extends Model {

    private String name;

    private String ocupation;

    private LocalDate age;

}
