package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Order implements OrderService {
    @Override
    public boolean order(final User user, final LocalDateTime dateOfOrder, final Product product) {
        System.out.println("Ordering product for: " + user.getFirstName() + " " + user.getLastName() +
                ".\nOrdered product: " + product.nameOfProduct + ".\nDate of order: " + dateOfOrder.toString() + ".");
        return true;

    }
}
