package ru.aberezhnoy.dao;

import ru.aberezhnoy.entity.Manufacturer;

public interface ManufacturerDao {

    Iterable<Manufacturer> findAll();

    public String findNameById(Long id);

    Manufacturer findByIb(Long id);

    void insert(Manufacturer manufacturer);

    void update(Manufacturer manufacturer);

    void deleteById(Long id);
}
