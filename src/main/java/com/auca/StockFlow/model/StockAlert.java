package com.auca.StockFlow.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class StockAlert {
    @Id
    private Long id;
    private String message;
    private Instant createdAt;
    private boolean isRead;

}
