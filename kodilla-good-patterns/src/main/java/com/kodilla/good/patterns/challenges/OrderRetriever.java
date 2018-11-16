package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRetriever {

    public OrderData retrieve() {
        User user = new User("Mark", "Greene");
        LocalDateTime dateOfOrder = LocalDateTime.of(2018, 11, 10, 12, 30);
        Product product = new Product("Call of Duty");

        return new OrderData(user, dateOfOrder, product);
    }

}
