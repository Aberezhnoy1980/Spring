package ru.aberezhnoy.hard;

public class HelloSpring {
    public static void main(String[] args) {
        MessageRender messageRender = MessageSupportFactory.getInstance().getMessageRender();
        messageRender.render();
    }
}
