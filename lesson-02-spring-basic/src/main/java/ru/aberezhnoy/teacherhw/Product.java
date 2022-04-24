package ru.aberezhnoy.teacherhw;

import lombok.*;

import java.util.Objects;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {
    private Integer id;
    private String title;
    private Double price;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Product product = (Product) o;
//
//        return id.equals(product.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return id.hashCode();
//    }
}

