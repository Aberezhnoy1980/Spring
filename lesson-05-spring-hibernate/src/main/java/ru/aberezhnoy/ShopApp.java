package ru.aberezhnoy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aberezhnoy.config.DbConfig;
import ru.aberezhnoy.dao.ManufacturerDao;
import ru.aberezhnoy.dao.OldJdbcManufacturerDao;
import ru.aberezhnoy.entity.Manufacturer;

public class ShopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
//        OldJdbcManufacturerDao oldJdbcManufacturerDao = new OldJdbcManufacturerDao();
//        ManufacturerDao manufacturerDao = new OldJdbcManufacturerDao();
        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        System.out.println(manufacturerDao.findNameById(3L));

        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
            System.out.println(manufacturer);
        }
    }
}
