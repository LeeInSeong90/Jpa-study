package com.example.jpastudy.repository;


import com.example.jpastudy.entity.Market;
import com.example.jpastudy.entity.QMarket;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MarketRepository {
    private final MarketJpaRepository marketJpaRepository;
    private final JPAQueryFactory jpaQueryFactory;

    public Market querydsl(String market){
        QMarket qMarket = QMarket.market;

        BooleanBuilder condition = new BooleanBuilder();
        condition.and(
                qMarket.marketSymbol.eq(market)
        );
        return jpaQueryFactory.selectFrom(qMarket)
                .where(condition)
                .stream().findFirst().get();

    }
    public Market jpa(String market){
        return marketJpaRepository.findByMarketSymbol(market).stream().findFirst().get();
    }
}
