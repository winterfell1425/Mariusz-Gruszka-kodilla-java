package com.kodilla.good.patterns.food2door;

public class ButcherShop implements ShopCreator {
    @Override
    public void process() {
        System.out.println("Thank you for shopping with ButcherShop.Your order will be delivered within 24 hours.");
    }
}
