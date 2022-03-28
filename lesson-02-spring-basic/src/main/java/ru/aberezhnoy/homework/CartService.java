package ru.aberezhnoy.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aberezhnoy.homework.persist.Product;
import ru.aberezhnoy.homework.persist.ProductRepository;

import java.util.*;

@Service
public class CartService {

    private ProductRepository productRepository;

    private Map<Optional<Product>, Integer> productCount;

    @Autowired
    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.productCount = new HashMap<>();
    }

    public void addProduct(long id, int count) {
        Optional<Product> product = getProductId(id);
        productCount.merge(product, count, Integer::sum);
    }

    public void removeProduct(long id, int count) {
        Optional<Product> product = getProductId(id);
        Integer curr = productCount.get(product);
        if (curr <= count) {
            productCount.remove(product);
        } else {
            productCount.merge(product, -count, Integer::sum);
        }
    }

    public void emptyCart() {
        productCount.clear();
    }

    public void getAll() {
        for (Map.Entry<Optional<Product>, Integer> e : productCount.entrySet()) {
            System.out.println("Your current order is: " + e.getKey().get().getTitle() + ", count: " + e.getValue());
        }
    }

    public void printCatalog() {
        productRepository.printCatalog();
        }

    private Optional<Product> getProductId(long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new IllegalArgumentException("Product with id not exist");
        }
        return product;
    }
}
