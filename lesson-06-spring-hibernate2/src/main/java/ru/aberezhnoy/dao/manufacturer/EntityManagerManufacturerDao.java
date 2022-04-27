package ru.aberezhnoy.dao.manufacturer;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.aberezhnoy.entity.Manufacturer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


@Repository
@Transactional
public class EntityManagerManufacturerDao implements ManufacturerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Iterable<Manufacturer> findAll() {
        return entityManager.createQuery("select m from Manufacturer m").getResultList();
    }

    @Override
    public String findNameById(Long id) {
        TypedQuery<String> namedQuery = entityManager.createNamedQuery("Manufacturer.findNameById", String.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    public Manufacturer findById(Long id) {
        TypedQuery<Manufacturer> namedQuery = entityManager.createNamedQuery("Manufacturer.findById", Manufacturer.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    public void insert(Manufacturer manufacturer) {

    }

    @Override
    public void update(Manufacturer manufacturer) {

    }

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        if (manufacturer.getId() == null) {
            entityManager.persist(manufacturer);
        } else {
            entityManager.merge(manufacturer);
        }
        return manufacturer;
    }

    @Override
    public void deleteById(Long id) {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(id);
        delete(manufacturer);
    }

    private void delete(Manufacturer manufacturer) {
        Manufacturer mergedManufacturer = entityManager.merge(manufacturer);
        entityManager.remove(mergedManufacturer);
    }
}
