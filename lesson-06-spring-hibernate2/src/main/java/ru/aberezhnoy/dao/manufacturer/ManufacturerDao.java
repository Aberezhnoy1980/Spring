package ru.aberezhnoy.dao.manufacturer;

import ru.aberezhnoy.entity.Manufacturer;

public interface ManufacturerDao {

    Iterable<Manufacturer> findAll();

    public String findNameById(Long id);

    Manufacturer findById(Long id);

    void insert(Manufacturer manufacturer);

    void update(Manufacturer manufacturer);

    Manufacturer save(Manufacturer manufacturer);

    void deleteById(Long id);
}
