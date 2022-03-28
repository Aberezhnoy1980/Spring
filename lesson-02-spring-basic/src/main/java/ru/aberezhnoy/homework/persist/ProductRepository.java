package ru.aberezhnoy.homework.persist;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    void save(Product product);

    void printCatalog();

    void delete(Long id);
}
