package org.example;

import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] items = new Food[] {
                new Meat(2, 55.0),
                new Apple(3, 8.0, Colour.RED),
                new Apple(1, 7.5, Colour.GREEN)
        };

        ShoppingCart cart = new ShoppingCart(items);

        System.out.printf("Без скидок: " + cart.getTotalWithoutDiscount());
        System.out.printf("Со скидкой: " + cart.getTotalWithDiscount());
        System.out.printf("Вегетарианское без скидки: " + cart.getVegetarianTotalWithoutDiscount());
    }
}