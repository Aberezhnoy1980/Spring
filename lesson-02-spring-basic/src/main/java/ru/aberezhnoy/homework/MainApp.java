package ru.aberezhnoy.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
}
