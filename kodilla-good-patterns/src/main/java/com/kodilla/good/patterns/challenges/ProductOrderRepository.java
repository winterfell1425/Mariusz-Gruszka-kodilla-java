package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrderRepository(final User user, final LocalDateTime dateOfOrder, final Product product) {
        return true;
    }
}
