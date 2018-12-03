package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuit {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame bun")
                .burgers(3)
                .sauce("Barbecue")
                .ingredient("Shrimps")
                .ingredient("Cheese")
                .ingredient("Chili peppers")
                .ingredient("Bacon")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whichSauce = bigmac.getSauce();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals("Barbecue", whichSauce);
        Assert.assertEquals(3, howManyBurgers);
    }
}