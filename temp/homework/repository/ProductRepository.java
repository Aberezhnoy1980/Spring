package ru.aberezhnoy.homework.repository;

import ru.aberezhnoy.homework.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void deleteById(Long id);
}
