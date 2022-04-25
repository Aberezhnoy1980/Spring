package ru.aberezhnoy.entity;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Product {
    private Long id;
    private String title;
    private BigDecimal cost;
    private LocalDate date;
}
