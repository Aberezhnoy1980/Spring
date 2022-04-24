package ru.aberezhnoy.teacherhw;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component("productRepository")
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {
        products.add(new Product(0, "Mouse", 4000d));
        products.add(new Product(0, "Keyboard", 8000d));
        products.add(new Product(0, "Monitor", 20000d));
        products.add(new Product(0, "Headphones", 60000d));
        products.add(new Product(0, "Phone", 100000d));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    public Optional<Product> findById(Integer id) {
        if (id < (products.size()) && id >= 0) {
            return Optional.of(products.get(id));
        } else {
            return Optional.empty();
        }
    }
}
