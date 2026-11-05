package com.auca.StockFlow.model;

import com.auca.StockFlow.model.enums.SaleStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
public class SalesTransaction {
    @Id
    private Long id;
    private Instant saleDate;
    private BigDecimal totalAmount;
    private SaleStatus status;
}
