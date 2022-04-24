package ru.aberezhnoy.teacherhw;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@RequiredArgsConstructor
@Component
@Scope("prototype")
public class Buyer {

    private final ShopController shopController;

    public Integer productsNumber;

    private Cart cart;

    Random r = new Random();

    @PostConstruct
    public void init() {
        productsNumber = r.nextInt(9) + 2;
        cart = shopController.getCart();
    }

    public void purchase() {
        System.out.println("Buyer want's to buy  " + productsNumber + " products");
        int i = 0;
        while (i < productsNumber) {
            shopController.addProductToCartById(new Random().nextInt(5), cart);
            i++;
        }
        int getOutProductId = r.nextInt(5);
        System.out.println("Buyer want to get out product with id: " + getOutProductId);
        shopController.deleteProductFromCartById(getOutProductId, cart);
    }

    public void showCart() {
        System.out.println("Buyer bought: ");
        cart.showList();
        System.out.println("-------------------------------------------");
    }
}
