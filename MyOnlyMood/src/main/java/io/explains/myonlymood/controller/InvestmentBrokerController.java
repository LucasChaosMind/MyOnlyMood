package io.explains.myonlymood.controller;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.BankTransactionDTO;
import io.explains.myonlymood.dto.InvestmentBrokerDTO;
import io.explains.myonlymood.dto.InvestmentTransactionsDTO;
import io.explains.myonlymood.model.BankTransaction;
import io.explains.myonlymood.model.InvestmentBroker;
import io.explains.myonlymood.model.InvestmentTransactions;
import io.explains.myonlymood.service.CRUD.IBankTransactionCrud;
import io.explains.myonlymood.service.CRUD.IInvestmentBrokerCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import org.modelmapper.ModelMapper;

public class InvestmentBrokerController extends RestrictCrudController<InvestmentBroker, InvestmentBrokerDTO,Long> {

    private final IInvestmentBrokerCrud service;

    private final ModelMapper modelMapper;

    public InvestmentBrokerController(IInvestmentBrokerCrud service, ModelMapper modelMapper) {
        super(InvestmentBroker.class, InvestmentBrokerDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<InvestmentBroker, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
