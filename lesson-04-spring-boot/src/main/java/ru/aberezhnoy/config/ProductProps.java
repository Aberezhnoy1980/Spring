package ru.aberezhnoy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import ru.aberezhnoy.model.Product;

import java.util.List;

@ConfigurationProperties("shop.properties")
@Getter
@Setter
public class ProductProps {

    private List<Product> products;
}
