package ru.aberezhnoy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aberezhnoy.config.JpaConfig;
import ru.aberezhnoy.dao.manufacturer.ManufacturerDao;
import ru.aberezhnoy.dao.product.ProductDao;
import ru.aberezhnoy.entity.Manufacturer;
import ru.aberezhnoy.entity.Product;

public class ShopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
//        OldJdbcManufacturerDao oldJdbcManufacturerDao = new OldJdbcManufacturerDao();
//        ManufacturerDao manufacturerDao = new OldJdbcManufacturerDao();
        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        ProductDao productDao = context.getBean(ProductDao.class);
//        CartDao cartDao = context.getBean(CartDao.class);
//        System.out.println(manufacturerDao.findNameById(3L));
//        System.out.println(manufacturerDao.findById(3L));
        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
            System.out.println(manufacturer);
        }

        // productDao testing

//        ProductDao productDao = new OldJdbcProductDao();
//        ProductDao productDao = context.getBean((ProductDao.class));
//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }
//        System.out.println(productDao.findById(3L));
//        System.out.println(productDao.findTitleById(3L));


//    Manufacturer testManufacturer = Manufacturer.builder()
//            .name("Test")
//            .products(new HashSet<Product>())
//            .build();
//
//        manufacturerDao.save(testManufacturer);
//        System.out.println(testManufacturer);

//        Product shrimpProduct = Product.builder()
//                .title("Shrimp")
//                .cost(new BigDecimal(500))
//                .date(LocalDate.now())
//                .manufacturer(manufacturerDao.findById(11L))
//                .build();
//
//        productDao.save(shrimpProduct);
//        System.out.println(shrimpProduct);

//        Product product = productDao.findById(5L);
////
//        productDao.delete(product);

//        manufacturerDao.deleteById(13L);

//        Cart cart = new Cart();
//        cart.addProduct(product);
//
//        cartDao.save(cart);
    }


}
