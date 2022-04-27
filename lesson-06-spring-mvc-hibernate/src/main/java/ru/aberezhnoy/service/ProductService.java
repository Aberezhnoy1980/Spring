package ru.aberezhnoy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aberezhnoy.entity.Product;
import ru.aberezhnoy.repository.ProductDao;

import java.util.List;

@Service
public class ProductService {

    private final ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findById(Long id) {
        return productDao.findById(id);
    }

    public Product saveOrUpdate(Product product) {
        return productDao.saveOrUpdate(product);
    }

    public void deleteById(Long id) {
        productDao.deleteById(id);
    }
}
