package com.auca.StockFlow.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class SaleItem {
    @Id
    private Long id;
    private int quantity;
    private BigDecimal price;
}
