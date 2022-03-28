package ru.aberezhnoy.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aberezhnoy.homework.persist.Product;
import ru.aberezhnoy.homework.persist.ProductRepository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void init() {
        productRepository.save(new Product("Product1", new BigDecimal("12.50")));
        productRepository.save(new Product("Product2", new BigDecimal("123.65")));
        productRepository.save(new Product("Product3", new BigDecimal("45.98")));
        productRepository.save(new Product("Product4", new BigDecimal("92.65")));
        productRepository.save(new Product("Product5", new BigDecimal("73.11")));
        productRepository.save(new Product("Product6", new BigDecimal("56.99")));
        productRepository.save(new Product("Product7", new BigDecimal("176.44")));
        productRepository.save(new Product("Product8", new BigDecimal("10.00")));
        productRepository.save(new Product("Product9", new BigDecimal("990.22")));
        productRepository.save(new Product("Product10", new BigDecimal("999.99")));
    }

    public long count() {
        return productRepository.findAll().size();
    }
}
