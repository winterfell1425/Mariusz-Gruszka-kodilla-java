package com.kodilla.good.patterns.food2door;

public class Order implements OrderService{
    @Override
    public boolean order(final Shop shop, final Foodstuff foodstuff, final Quantity quantity) {
        System.out.println("Ordering product from: " + shop.getShopName() +
                ".\nOrdered foodstuff: " + foodstuff.nameOfFoodstuff + ".\nQuantity of foodstuff: " + quantity.getUnitOfMeasure() + " of;  " + quantity.getNameOfMeasure() + ".");
        return true;
        }
}
