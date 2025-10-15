package org.example.model;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super(amount, price, /* isVegetarian = */ false);
    }

    @Override
    public double getDiscount() {
        return 0.0;
    }
}