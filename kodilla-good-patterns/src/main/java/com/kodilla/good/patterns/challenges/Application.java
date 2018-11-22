package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderData orderData = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new UserOrderInfo(), new Order(), new ProductOrderRepository());
        productOrderService.process(orderData);
    }
}

