package io.explains.myonlymood.service;

import io.explains.myonlymood.model.AccountBank;
import io.explains.myonlymood.model.InvestmentBroker;
import io.explains.myonlymood.repository.AccountBankRespository;
import io.explains.myonlymood.service.CRUD.IAccountBankCrud;
import io.explains.myonlymood.service.CRUD.IBankTransactionCrud;
import io.explains.myonlymood.service.CRUD.Impl.RestrictCrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;

public class AccountBankServiceImpl extends RestrictCrudServiceImpl<AccountBank, Long> implements IAccountBankCrud {

    private final AccountBankRespository repository;

    public AccountBankServiceImpl(AccountBankRespository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<AccountBank, Long> getRepository() {
        return repository;
    }

}
