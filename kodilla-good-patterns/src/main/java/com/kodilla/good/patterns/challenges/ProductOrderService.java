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

    public OrderDto process(final OrderProduct orderProduct) {
        boolean isOrdered = orderService.order(orderProduct.getUser(), orderProduct.getDateOfOrder(), orderProduct.getProduct());

        if(isOrdered) {
            informationService.inform(orderProduct.getUser());
            orderRepository.createOrderRepository(orderProduct.getUser(),orderProduct.getDateOfOrder(), orderProduct.getProduct());
            return new OrderDto(orderProduct.getUser(), true);
        } else {
            return new OrderDto(orderProduct.getUser(), false);
        }
    }
}
