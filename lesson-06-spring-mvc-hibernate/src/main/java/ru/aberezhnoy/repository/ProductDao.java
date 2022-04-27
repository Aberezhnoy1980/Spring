package ru.aberezhnoy.repository;

import ru.aberezhnoy.entity.Product;

import java.util.List;

public interface ProductDao {

    List<Product> findAll();

    Product findById(Long id);

    Product saveOrUpdate(Product product);

    void deleteById(Long id);
}
