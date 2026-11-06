package com.auca.StockFlow.repository;

import com.auca.StockFlow.model.DemandForecast;
import com.auca.StockFlow.model.DemandHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepository extends JpaRepository<DemandForecast, Long> {
}
