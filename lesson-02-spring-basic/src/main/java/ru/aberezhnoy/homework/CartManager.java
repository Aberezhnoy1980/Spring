package ru.aberezhnoy.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class CartManager {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CartService cartService = context.getBean(CartService.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please see our today's offer:\n");
        cartService.printCatalog();

        CartService cart = null;

        label:
        while (true) {
            System.out.println("Please, choose an action:\n to create a new cart: new \n to add an item text: add \n to remove item text: remove \n to view the current cart text: current order \n to empty current cart text: clear \n to leave text exit");

            String customerChoice = scanner.nextLine();
            switch (customerChoice) {
                case "new":
                    cart = cartService;
                    System.out.println("Cart created");
                    break;
                case "add":
                    if (cart == null) {
                        System.out.println("Please, create a new cart");
                        break;
                    }
                    System.out.println("Please, text the product id that you want to add");
                    long idToAdd = scanner.nextLong();
                    System.out.println("Please, text count of product that you want to add");
                    int countToAdd = scanner.nextInt();
                    cart.addProduct(idToAdd, countToAdd);
                    break;
                case "remove":
                    System.out.println("Please, text the product id that you want to remove");
                    long idToRemove = scanner.nextLong();
                    System.out.println("Please, text count of product that you want to remove");
                    int countToRemove = scanner.nextInt();
                    assert cart != null;
                    cart.removeProduct(idToRemove, countToRemove);
                    break;
                case "clear":
                    assert cart != null;
                    cart.emptyCart();
                    System.out.println("Your cart is now empty. Do you want to continue? ");
                    break;
                case "current order":
                    assert cart != null;
                    cart.getAll();
                    break;
                case "exit":
                    System.out.println("Have a nice day! We hope to see you soon!");
                    break label;
            }
        }
    }
}
