package io.explains.myonlymood.model;

import io.explains.myonlymood.model.enums.InvestmentActiveType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class InvestmentActiveCategory {

    @Id
    private Long Id;

    @NotNull
    private InvestmentActiveType activeType;



}
