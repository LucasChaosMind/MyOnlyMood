package io.explains.myonlymood.service;

import io.explains.myonlymood.model.InvestmentTransactions;
import io.explains.myonlymood.repository.InvestmentTransactionsRepository;
import io.explains.myonlymood.service.CRUD.IInvestmentTransactionsCrud;
import io.explains.myonlymood.service.CRUD.Impl.RestrictCrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InvestmentTransactionsServiceImpl extends RestrictCrudServiceImpl<InvestmentTransactions, Long> implements IInvestmentTransactionsCrud {

    private final InvestmentTransactionsRepository repository;

    public InvestmentTransactionsServiceImpl(InvestmentTransactionsRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<InvestmentTransactions, Long> getRepository() {
        return repository;
    }
}
