package com.kodilla.testing.collection;
import org.junit.After;
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
        ArrayList<Integer> myList3 = new ArrayList<>();
        System.out.println("This is a list of all my numbers: " + myList3 + ".");
        OddNumbersExterminator exterminator3 = new OddNumbersExterminator();
        exterminator3.exterminate(myList3);
        System.out.println("This is a list of all my even numbers: " + exterminator3.getEvenNumbers() + ".");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> myList2 = new ArrayList<>();
        Random theGenerator = new Random();
        for(int n=0; n < 20; n++) {
            myList2.add(theGenerator.nextInt(20));
        }
        System.out.println("This is a list of all my numbers: " + myList2 + ".");
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        exterminator2.exterminate(myList2);
        System.out.println("This is a list of all my even numbers: " + exterminator2.getEvenNumbers() + ".");
    }
}
