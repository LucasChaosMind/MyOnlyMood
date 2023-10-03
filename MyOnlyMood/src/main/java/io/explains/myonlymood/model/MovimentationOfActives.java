package io.explains.myonlymood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class MovimentationOfActives {

    @Id
    private Long id;

    @ManyToMany
    private List<Bank> banks;

    @ManyToMany
    private List<InvestmentBroker> investmentBrokers;

}
