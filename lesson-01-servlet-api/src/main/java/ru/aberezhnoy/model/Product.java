package ru.aberezhnoy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private BigDecimal cost;
}
