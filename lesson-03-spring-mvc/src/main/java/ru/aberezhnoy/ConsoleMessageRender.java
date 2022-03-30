package ru.aberezhnoy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class ConsoleMessageRender implements MessageRender {

//    private MessageProvider messageProvider;

//    @Autowired
//    public ConsoleMessageRender(MessageProvider messageProvider) {
//        this.messageProvider = messageProvider;
//    }

//    @Override
//    public void render() {
//        System.out.println(messageProvider.getMessage());
//    }

    @Override
    public void render() {
        getMessageProvider().getMessage();
    }

//    @Override
//    public MessageProvider getMessageProvider() {
//        return this.messageProvider;
//    }

    @Override
    @Lookup
    public MessageProvider getMessageProvider() {
        return null;
    }

//    @Override
//    @Autowired
////    @Qualifier("provider")
//    public void setMessageProvider(MessageProvider provider) {
//        this.messageProvider = provider;
//    }

    @Override
    @Autowired
//    @Qualifier("provider")
    public void setMessageProvider(MessageProvider provider) {
    }
}
