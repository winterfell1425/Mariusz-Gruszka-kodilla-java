package com.kodilla.good.patterns.food2door;

public class OrderRetriever {
    public OrderData retrieveMilk() {

        Shop shop1 = new Shop("MilkShop");

        Foodstuff foodstuff1 = new Foodstuff("Milk");

        Quantity quantity1 = new Quantity(2.0, "1-liter bottles");

        return new OrderData(shop1, foodstuff1, quantity1);
    }
    public OrderData retrieveMeat() {
        Shop shop2 = new Shop("ButcherShop");

        Foodstuff foodstuff2 = new Foodstuff("Mutton");

        Quantity quantity2 = new Quantity(1.5, "kilograms");

        return new OrderData(shop2, foodstuff2, quantity2);
    }
    public OrderData retrieveCheese() {
        Shop shop3 = new Shop("CheeseShop");

        Foodstuff foodstuff3 = new Foodstuff("Gouda");

        Quantity quantity3 = new Quantity(0.5, "kilograms");

        return new OrderData(shop3, foodstuff3, quantity3);
    }
}
