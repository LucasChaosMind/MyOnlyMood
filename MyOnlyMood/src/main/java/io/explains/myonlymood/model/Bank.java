package io.explains.myonlymood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Bank {

    @Id
    private Long Id;

    @ManyToMany
    private List<BankTransaction> transactions;

}
