package io.explains.myonlymood.dto;

import io.explains.myonlymood.model.enums.BanksActiveType;
import io.explains.myonlymood.model.enums.TransferStatus;
import jakarta.validation.constraints.NotNull;

public class BankActiveCategoryDTO {

    private Integer priority;

    @NotNull
    private BanksActiveType Type;

    @NotNull
    private TransferStatus statusType;
}
