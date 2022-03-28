package ru.aberezhnoy.spring_context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:message-context.properties")
public class HelloConfiguration {

//    @Bean
//    public MessageProvider provider() {
//        return new WantMessageProvider();
//    }
//
//    @Bean
//    public MessageRender render() {
//        return new ConsoleMessageRender(provider());
//    }

//    @Bean
//    public InjectFoodStuffAnnotationBeanPostProcessor custom() {
//        return new InjectFoodStuffAnnotationBeanPostProcessor();
//    }
}
