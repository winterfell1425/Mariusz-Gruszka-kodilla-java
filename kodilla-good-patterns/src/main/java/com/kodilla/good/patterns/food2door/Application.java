package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main (String[]args){
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderData orderData1= orderRetriever.retrieveMilk();
        OrderData orderData2 = orderRetriever.retrieveMeat();
        OrderData orderData3 = orderRetriever.retrieveCheese();

        ShopIntegrationService shopIntegrationService1 = new ShopIntegrationService(new OrderInfo(), new Order(), new MilkShop());
        ShopIntegrationService shopIntegrationService2 = new ShopIntegrationService(new OrderInfo(), new Order(), new ButcherShop());
        ShopIntegrationService shopIntegrationService3 = new ShopIntegrationService(new OrderInfo(), new Order(), new CheeseShop());

        shopIntegrationService1.fullfil(orderData1);
        shopIntegrationService2.fullfil(orderData2);
        shopIntegrationService3.fullfil(orderData3);
    }
}

