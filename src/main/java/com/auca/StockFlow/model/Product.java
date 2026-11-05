package com.auca.StockFlow.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private String sku;
    private BigDecimal unitePrice;
    private int quantity;
    private int lowStockThreshold;
    private boolean isPerishable;
    private Instant expiryDate;


}
