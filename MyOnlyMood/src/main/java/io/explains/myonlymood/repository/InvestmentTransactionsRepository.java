package io.explains.myonlymood.repository;

import io.explains.myonlymood.model.InvestmentTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentTransactionsRepository extends JpaRepository<InvestmentTransactions, Long> {
}
