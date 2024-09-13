package com.example.jpastudy.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "MARKETS")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MARKET_ID")
    private int marketId;

    @Column(name = "MARKET_SYMBOL", nullable = false)
    private String marketSymbol;

    @Column(name = "MARKET_KOREAN_NAME", nullable = false)
    private String koreanName;

    @Column(name = "MARKET_ENGLISH_NAME", nullable = false)
    private String englishName;

    @Column(name = "MARKET_WARNING", nullable = false)
    private String marketWarning;
}
