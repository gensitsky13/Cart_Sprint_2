package org.example.service;

import org.example.model.Discountable;
import org.example.model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма без скидки
    public double getTotalWithoutDiscount() {
        double sum = 0.0;
        for (Food f : items) {
            sum += f.getPrice() * f.getAmount();
        }
        return sum;
    }

    // Общая сумма со скидкой
    public double getTotalWithDiscount() {
        double sum = 0.0;
        for (Food f : items) {
            double row = f.getPrice() * f.getAmount();
            double discount = (f instanceof Discountable)
                    ? ((Discountable) f).getDiscount() : 0.0;
            sum += row * (1.0 - discount / 100.0);
        }
        return sum;
    }

    // Общая сумма вегетарианских продуктов без скидки
    public double getVegetarianTotalWithoutDiscount() {
        double sum = 0.0;
        for (Food f : items) {
            if (f.isVegetarian()) {
                sum += f.getPrice() * f.getAmount();
            }
        }
        return sum;
    }
}