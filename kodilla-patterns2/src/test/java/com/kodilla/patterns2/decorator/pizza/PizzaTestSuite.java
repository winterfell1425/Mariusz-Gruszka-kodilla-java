package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaTestSuite {
    @Test
    public void testBasicMargharitaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicMargharitaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Neapolitan dough with tomato sauce and mozzarella cheese", description);
    }

    @Test
    public void testFarmerPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new FarmerPizzaOrder(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testFarmerPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new FarmerPizzaOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Neapolitan dough with tomato sauce and mozzarella cheese + ham", description);
    }

    @Test
    public void testHawaiiPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new HawaiiPizzaOrder(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testHawaiiPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new HawaiiPizzaOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Neapolitan dough with tomato sauce and mozzarella cheese + ham and pineapple", description);
    }

    @Test
    public void testFarmerPizzaWithAnchoisGetCost() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new FarmerPizzaOrder(theOrder);
        theOrder = new AnchoisDecorator(theOrder);
        System.out.println("Total order value: $" + theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void testFarmerPizzaWithAnchoisGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new FarmerPizzaOrder(theOrder);
        theOrder = new AnchoisDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Neapolitan dough with tomato sauce and mozzarella cheese + ham + anchois", description);
    }

    @Test
    public void testHawaiiPizzaWith3IngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new HawaiiPizzaOrder(theOrder);
        theOrder = new AnchoisDecorator(theOrder);
        theOrder = new RucolaDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        System.out.println("Total order value: $" + theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(33), theCost);
    }

    @Test
    public void testHawaiiPizzaWith3IngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new HawaiiPizzaOrder(theOrder);
        theOrder = new AnchoisDecorator(theOrder);
        theOrder = new RucolaDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Neapolitan dough with tomato sauce and mozzarella cheese + ham and pineapple + anchois + rucola + bacon", description);
    }
    @Test
    public void testMargheritaPizzaWith3IngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new AnchoisDecorator(theOrder);
        theOrder = new RucolaDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new MozzarellaCheeseDecorator(theOrder);
        System.out.println("Total order value: $" + theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testMargheritaPizzaWith3IngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicMargharitaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new AnchoisDecorator(theOrder);
        theOrder = new RucolaDecorator(theOrder);
        theOrder = new MozzarellaCheeseDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Neapolitan dough with tomato sauce and mozzarella cheese + bacon + anchois + rucola + mozzarella cheese", description);
    }
}