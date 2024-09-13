package com.example.jpastudy.repository;


import com.example.jpastudy.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MarketJpaRepository extends JpaRepository<Market, Integer> {
    List<Market> findByMarketSymbol(String marketSymbol);
}
