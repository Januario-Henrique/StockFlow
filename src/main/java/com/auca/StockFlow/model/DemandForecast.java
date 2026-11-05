package com.auca.StockFlow.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class DemandForecast {
    @Id
    private Long id;
    private Date forecastDate;
    private int predictedQuantity;
    private int horizonDays;
    private float confidence;
    private Date generatedAt;

}
