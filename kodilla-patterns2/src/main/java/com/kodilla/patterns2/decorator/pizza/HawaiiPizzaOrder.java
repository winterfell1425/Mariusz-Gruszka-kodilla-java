package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiiPizzaOrder extends AbstractPizzaOrderDecorator {
    public HawaiiPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + ham and pineapple";
    }
}
