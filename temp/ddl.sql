CREATE
DATABASE GB_SHOP;

CREATE TABLE PRODUCTS
(
    ID    BIGSERIAL      NOT NULL PRIMARY KEY,
    TITLE VARCHAR(255)   NOT NULL,
    PRICE  DECIMAL(10, 2) NOT NULL
);