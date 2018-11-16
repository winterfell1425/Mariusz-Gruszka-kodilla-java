package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderData orderData) {
        boolean isOrdered = orderService.order(orderData.getUser(), orderData.getDateOfOrder(), orderData.getProduct());

        if(isOrdered) {
            informationService.inform(orderData.getUser());
            orderRepository.createOrderRepository(orderData.getUser(),orderData.getDateOfOrder(), orderData.getProduct());
            return new OrderDto(orderData.getUser(), true);
        } else {
            return new OrderDto(orderData.getUser(), false);
        }
    }
}
