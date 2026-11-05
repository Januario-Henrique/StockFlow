package com.auca.StockFlow.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class DemandHistory {
    @Id
    private Long id;
    private Instant date;
    private int quantitySold;

}
