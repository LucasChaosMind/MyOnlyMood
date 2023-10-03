package io.explains.myonlymood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity @Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentBroker {

    @Id
    private Long id;

    private String name;

    @ManyToMany
    private List<InvestmentActiveCategory> categories;

    @ManyToMany
    private List<InvestmentTransactions> transactions;
}
