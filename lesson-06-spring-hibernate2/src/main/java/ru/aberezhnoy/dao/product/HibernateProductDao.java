package ru.aberezhnoy.dao.product;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.aberezhnoy.entity.Product;

import java.util.Collections;

//@Component
@RequiredArgsConstructor
public class HibernateProductDao implements ProductDao {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Product> findAll() {
        return Collections.unmodifiableList(sessionFactory.getCurrentSession().createQuery("from Product p").list());
    }

    @Override
    @Transactional
    public Product save(Product product) {
        sessionFactory.getCurrentSession().saveOrUpdate(product);
        return product;
    }

    @Override
    @Transactional
    public void delete(Product product) {
        sessionFactory.getCurrentSession().delete(product);
    }

    @Override
    @Transactional(readOnly = true)
    public String findTitleById(Long id) {
        return (String) sessionFactory.getCurrentSession().getNamedQuery("Product.findNameById")
                .setParameter("id", id).uniqueResult();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return (Product) sessionFactory.getCurrentSession().getNamedQuery("Product.findById")
                .setParameter("id", id).uniqueResult();
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteById(Long id) {

    }
}