package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38000000"), "Poland");
        Country germany = new Country(new BigDecimal("80000000"), "Germany");
        Country france = new Country(new BigDecimal("65000000"), "France");

        Country egypt = new Country(new BigDecimal("80000000"), "Egypt");
        Country nigeria = new Country(new BigDecimal("180000000"), "Nigeria");
        Country togo = new Country(new BigDecimal("6000000"), "Togo");

        Country china = new Country(new BigDecimal("1300000000"), "China");
        Country india = new Country(new BigDecimal("1200000000"), "India");
        Country bhutan = new Country(new BigDecimal("3000000"), "Togo");


        //When
        Continent europe = new Continent("Europe");
        europe.getCountries().add(poland);
        europe.getCountries().add(germany);
        europe.getCountries().add(france);
        Continent africa = new Continent("Africa");
        africa.getCountries().add(egypt);
        africa.getCountries().add(nigeria);
        africa.getCountries().add(togo);
        Continent asia = new Continent("Asia");
        asia.getCountries().add(china);
        asia.getCountries().add(india);
        asia.getCountries().add(bhutan);

        World myWorld = new World();
        myWorld.getContinents().add(europe);
        myWorld.getContinents().add(africa);
        myWorld.getContinents().add(asia);

        //Then
        BigDecimal expectedPopulace = new BigDecimal("2952000000");
        Assert.assertEquals(expectedPopulace, myWorld.getPeopleQuantity());
    }
}
