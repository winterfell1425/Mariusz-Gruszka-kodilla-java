package com.kodilla.good.patterns.challenges;

public class UserOrderInfo implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Your order has been created!");
    }

}
