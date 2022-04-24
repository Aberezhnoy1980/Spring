package ru.aberezhnoy.homework.repository;

import ru.aberezhnoy.homework.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> findAll();

    Optional<Product> findById(long id);

    void save(Product product);

    void deleteById(long id);
}
