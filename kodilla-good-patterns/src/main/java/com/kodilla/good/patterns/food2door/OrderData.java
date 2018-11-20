
package com.kodilla.good.patterns.food2door;

public class OrderData {

    private Shop shop;
    private Foodstuff foodstuff;
    private Quantity quantity;

    public OrderData(final Shop shop, final Foodstuff foodstuff, final Quantity quantity) {
        this.shop = shop;
        this.foodstuff = foodstuff;
        this.quantity = quantity;
    }

    public Shop getShop() {
        return shop;
    }

    public Foodstuff getFoodstuff() {
        return foodstuff;
    }

    public Quantity getQuantity() {
        return quantity;
    }

}

