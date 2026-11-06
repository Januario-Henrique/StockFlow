package com.auca.StockFlow.repository;

import com.auca.StockFlow.model.SalesTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<SalesTransaction, Long> {
}
