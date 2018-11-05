//package com.kodilla.stream.world;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//
//import java.util.List;
//
//public class WorldTestSuite {
//    @Test
//    public void testGetPeopleQuantity() {
//        //Given
//        Country poland = new Country(new BigDecimal("38000000"), "Poland");
//        Country germany = new Country(80000000);
//        Country france = new Country(65000000);
//
//        Country egypt = new Country(80000000);
//        Country nigeria = new Country(180000000);
//        Country togo = new Country(6000000);
//
//        //When
//        Continent europe = new Continent("Europe");
//        europe.getCountries().add(poland);
//        europe.add(germany);
//        europe.add(france);
//        List<Country> africa = new ArrayList<>();
//        africa.add(egypt);
//        africa.add(nigeria);
//        africa.add(togo);
//
//        World myWorld = new World();
//        myWorld.getContinents().add(europe);
//        myWorld.add(africa);
//
//
//        //Then
//        BigDecimal expectedPopulance = new BigDecimal("449000000");
//        Assert.assertEquals(expectedPopulance, myWorld.getPeopleQuantity());
//
//
//    }
//
//}
