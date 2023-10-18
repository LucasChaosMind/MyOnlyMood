package io.explains.myonlymood.dto;

import io.explains.myonlymood.model.enums.InvestmentActiveType;
import io.explains.myonlymood.model.enums.StockBuyOrSell;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class InvestmentTransactionsDTO {

    @NotNull
    private StockBuyOrSell buyOrSell;

    @NotNull
    private BigDecimal thePrice;

    private InvestmentActiveType type;
}
