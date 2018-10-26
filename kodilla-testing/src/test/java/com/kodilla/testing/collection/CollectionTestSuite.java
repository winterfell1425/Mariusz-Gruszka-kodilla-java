package com.kodilla.testing.collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> myNumbersList3 = new ArrayList<>();
        ArrayList<Integer> myEvenNumbersList3 = new ArrayList<>();

        //When
        OddNumbersExterminator exterminator3 = new OddNumbersExterminator();
        exterminator3.exterminate(myNumbersList3);
        System.out.println("Testing empty list of numbers...");

        //Then
        Assert.assertEquals(myEvenNumbersList3, exterminator3.getEvenNumbers());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> myNumbersList2 = new ArrayList<>();
        myNumbersList2.add(0);
        myNumbersList2.add(1);
        myNumbersList2.add(2);
        myNumbersList2.add(3);
        myNumbersList2.add(4);
        myNumbersList2.add(5);
        myNumbersList2.add(6);
        myNumbersList2.add(7);

        ArrayList<Integer> myEvenNumbersList2 = new ArrayList<>();
        myEvenNumbersList2.add(2);
        myEvenNumbersList2.add(4);
        myEvenNumbersList2.add(6);

        //When
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        exterminator2.exterminate(myNumbersList2);
        System.out.println("Testing non-empty list of numbers...");

        //Then
        Assert.assertEquals(myEvenNumbersList2, exterminator2.getEvenNumbers());
    }
}
