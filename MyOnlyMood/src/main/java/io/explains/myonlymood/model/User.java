package io.explains.myonlymood.model;

import io.explains.myonlymood.model.NonEssential.Interest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity @Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    private String ocupation;


    private String username;


    private String email;


    private String password;

    @Getter
    private LocalDate age;

    private Interest firstInterest;

}
