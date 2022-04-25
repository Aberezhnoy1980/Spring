package ru.aberezhnoy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aberezhnoy.config.DbConfig;
import ru.aberezhnoy.dao.ProductDao;
import ru.aberezhnoy.entity.Product;

public class ShopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
//        OldJdbcManufacturerDao oldJdbcManufacturerDao = new OldJdbcManufacturerDao();
//        ManufacturerDao manufacturerDao = new OldJdbcManufacturerDao();
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        System.out.println(manufacturerDao.findNameById(3L));
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }

        // productDao testing

//        ProductDao productDao = new OldJdbcProductDao();
        ProductDao productDao = context.getBean((ProductDao.class));
//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }
        System.out.println(productDao.findById(3L));
//        System.out.println(productDao.findTitleById(3L));
    }
}
