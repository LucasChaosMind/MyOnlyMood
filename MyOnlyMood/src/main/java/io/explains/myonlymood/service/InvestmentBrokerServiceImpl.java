package io.explains.myonlymood.service;

import io.explains.myonlymood.model.InvestmentBroker;
import io.explains.myonlymood.repository.InvestmentBrokerRepository;
import io.explains.myonlymood.service.CRUD.IInvestmentBrokerCrud;
import io.explains.myonlymood.service.CRUD.Impl.RestrictCrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class InvestmentBrokerServiceImpl extends RestrictCrudServiceImpl<InvestmentBroker, Long> implements IInvestmentBrokerCrud {

    private final InvestmentBrokerRepository repository;

    public InvestmentBrokerServiceImpl(InvestmentBrokerRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<InvestmentBroker, Long> getRepository() {
        return repository;
    }


}
