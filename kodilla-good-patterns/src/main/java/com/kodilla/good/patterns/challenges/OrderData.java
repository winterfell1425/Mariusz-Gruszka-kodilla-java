package com.kodilla.good.patterns.challenges;

import java.time.*;

public class OrderData {

    private User user;
    private LocalDateTime dateOfOrder;
    private Product product;

    public OrderData(final User user, final LocalDateTime dateOfOrder, final Product product) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Product getProduct() {
        return product;
    }


}
