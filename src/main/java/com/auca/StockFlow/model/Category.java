package com.auca.StockFlow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    private Long id;
    private String name;
    private String description;

}
