package com.kodilla.good.patterns.food2door;

public class MilkShop implements ShopCreator {
    @Override
    public void process(){
        System.out.println("Thank you for shopping with MilkShop.Your order will be sent promptly.");
    }
}
