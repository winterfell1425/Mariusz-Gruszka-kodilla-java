package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main (String[]args){
        OrderRetriver orderRetriver = new OrderRetriver();
        OrderProduct orderProduct = orderRetriver.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new UserOrderInfo(),new Order(),new ProductOrderRepository());
        productOrderService.process(orderProduct);
    }
}

