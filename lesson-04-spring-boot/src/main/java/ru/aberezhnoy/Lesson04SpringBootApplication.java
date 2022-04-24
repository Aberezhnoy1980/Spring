package ru.aberezhnoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.aberezhnoy.config.ProductProps;

@SpringBootApplication
@EnableConfigurationProperties(ProductProps.class)
public class Lesson04SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lesson04SpringBootApplication.class, args);
    }

}
