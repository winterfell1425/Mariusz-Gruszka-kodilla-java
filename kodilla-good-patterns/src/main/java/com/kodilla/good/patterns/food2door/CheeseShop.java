package com.kodilla.good.patterns.food2door;

public class CheeseShop implements ShopCreator {
    @Override
    public void process() {
        System.out.println("Thank you for shopping with CheeseShop.You've received 20% discount for your next order.");
    }
}
