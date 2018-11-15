package com.kodilla.good.patterns.challenges;

import java.time.*;

import java.time.LocalDate;
import java.util.Objects;

public class OrderProduct {

    private User user;
    private LocalDateTime dateOfOrder;
    private Product product;

    public OrderProduct(final User user, final LocalDateTime dateOfOrder, final Product product) {
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
