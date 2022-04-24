package ru.aberezhnoy.homework.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String title;
    private BigDecimal price;
}

