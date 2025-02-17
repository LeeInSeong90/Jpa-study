DROP TABLE IF EXISTS MARKETS;

CREATE TABLE MARKETS
(
    MARKET_ID           BIGINT          NOT NULL AUTO_INCREMENT,
    MARKET_SYMBOL       VARCHAR(100)    NOT NULL,
    MARKET_KOREAN_NAME  VARCHAR(100)    NOT NULL,
    MARKET_ENGLISH_NAME VARCHAR(100)    NOT NULL,
    MARKET_WARNING      VARCHAR(100)    NOT NULL,
    PRIMARY KEY (MARKET_ID)
);