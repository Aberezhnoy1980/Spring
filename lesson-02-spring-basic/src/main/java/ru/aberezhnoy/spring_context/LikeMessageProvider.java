package ru.aberezhnoy.spring_context;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("like")
public class LikeMessageProvider implements MessageProvider {

    @InjectFoodStuff
    String foodStuff;

    @Override
    public String getMessage() {
        return "I like " + foodStuff;
    }
}
