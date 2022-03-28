package ru.aberezhnoy.spring_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class HelloSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfiguration.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        MessageRender messageRender = context.getBean("render", MessageRender.class);
        for (int i = 0; i < 5; i++) {
            messageRender.render();
        }
//        messageRender.render();
        context.close();
    }
}
