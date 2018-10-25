package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer number;
            number = iterator.next();
            if ((number != 0) && ((number % 2) == 0)) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}
