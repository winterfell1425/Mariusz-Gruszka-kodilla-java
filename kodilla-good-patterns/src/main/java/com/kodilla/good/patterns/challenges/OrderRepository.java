package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrderRepository(User user, LocalDateTime dateOfOrder, Product product);
}
