package com.kodilla.good.patterns.food2door;

public class ShopIntegrationService {
    private InformationService informationService;
    private OrderService orderService;
    private ShopCreator shopCreator;

    public ShopIntegrationService(final InformationService informationService,
                                  final OrderService orderService,
                                  final ShopCreator shopCreator) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.shopCreator = shopCreator;
    }

    public OrderDto fullfil(final OrderData orderData) {
        boolean isOrdered = orderService.order(orderData.getShop(), orderData.getFoodstuff(), orderData.getQuantity());

        if (isOrdered) {
            shopCreator.process();
            informationService.inform(orderData.getShop());
            return new OrderDto(orderData.getShop(), true);
        } else {
            return new OrderDto(orderData.getShop(), false);
        }
    }
}
