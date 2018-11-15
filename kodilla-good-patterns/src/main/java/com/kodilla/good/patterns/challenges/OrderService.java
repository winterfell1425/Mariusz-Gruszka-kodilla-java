package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean order(final User user, final LocalDateTime dateOfOrder, final Product product);
}
