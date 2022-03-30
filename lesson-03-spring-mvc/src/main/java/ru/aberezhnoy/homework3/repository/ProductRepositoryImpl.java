package ru.aberezhnoy.homework3.repository;

import org.springframework.stereotype.Repository;
import ru.aberezhnoy.homework3.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final Map<Long, Product> products = new ConcurrentHashMap<>();

    private final AtomicLong identity = new AtomicLong(0);

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Optional<Product> findById(long id) {
        return Optional.ofNullable(products.get(id));
    }

    @Override
    public void save(Product product) {
        if (product.getId() == null) {
            long id = identity.incrementAndGet();
            product.setId(id);
        }
        products.put(product.getId(), product);
//        Product.builder()
//                .id(product.getId())
//                .title(product.getTitle())
//                .price(product.getPrice())
//                .build();
    }

    @Override
    public void deleteById(long id) {
        products.remove(id);
    }
}
