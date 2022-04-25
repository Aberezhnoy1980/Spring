package ru.aberezhnoy.dao;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.aberezhnoy.entity.Manufacturer;

import java.util.Collections;

@Component
@RequiredArgsConstructor
public class HibernateManufacturerDao implements ManufacturerDao {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Manufacturer> findAll() {
        return Collections.unmodifiableList(sessionFactory.getCurrentSession().createQuery("from Manufacturer m").list());
    }

    @Override
    @Transactional(readOnly = true)
    public String findNameById(Long id) {
        return (String) sessionFactory.getCurrentSession().getNamedQuery("Manufacturer.findNameById")
                .setParameter("id", id).uniqueResult();
    }

    @Override
    public Manufacturer findByIb(Long id) {
        return (Manufacturer) sessionFactory.getCurrentSession().getNamedQuery("Manufacturer.findById")
                .setParameter("id", id).uniqueResult();
    }

    @Override
    public void insert(Manufacturer manufacturer) {

    }

    @Override
    public void update(Manufacturer manufacturer) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
