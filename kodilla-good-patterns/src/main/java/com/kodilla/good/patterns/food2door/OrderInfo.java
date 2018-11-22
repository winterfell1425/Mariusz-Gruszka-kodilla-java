package com.kodilla.good.patterns.food2door;

public class OrderInfo implements InformationService {
    @Override
    public void inform(final Shop shop) {
        System.out.println("This is information from 'food2door': Your order at: " + shop.getShopName() + " has been fulfilled.\nPlease do not hesitate to contact us in case of any problems or doubts.");
    }

}
