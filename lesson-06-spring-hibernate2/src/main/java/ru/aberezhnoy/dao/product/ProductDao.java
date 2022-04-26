package ru.aberezhnoy.dao.product;

import ru.aberezhnoy.entity.Product;

public interface ProductDao {

    Iterable<Product> findAll();

    public String findTitleById(Long id);

    Product findById(Long id);

    Product save(Product product);

    void delete(Product product);

    void insert(Product product);

    void update(Product product);

    void deleteById(Long id);
}
