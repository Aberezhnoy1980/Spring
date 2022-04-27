package ru.aberezhnoy.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.aberezhnoy.dao.manufacturer.ManufacturerDao;
import ru.aberezhnoy.entity.Manufacturer;

//@Component
@RequiredArgsConstructor
public class JdbcTemplateManufacturerDao implements ManufacturerDao {
    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        return null;
    }

    private final JdbcTemplate jdbcTemplate;

    @Override
    public String findNameById(Long id) {
        return jdbcTemplate.queryForObject("SELECT name FROM manufacturer WHERE id = ?", String.class, id);
    }

    @Override
    public Iterable<Manufacturer> findAll() {
        return null;
    }

    @Override
    public Manufacturer findById(Long id) {
        return null;
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
