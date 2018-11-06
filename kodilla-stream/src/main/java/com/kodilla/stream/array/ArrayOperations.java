package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
         IntStream.range(0, numbers.length);
         System.out.println(numbers);
         OptionalDouble myAverage = IntStream.range(0, numbers.length)
         .average();
         return myAverage.orElse(-50);
    }
}
