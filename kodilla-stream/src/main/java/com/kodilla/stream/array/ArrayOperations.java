package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(i->numbers[i])
                .forEach(System.out::println);
        OptionalDouble myAverage = IntStream.range(0, numbers.length)
                .map(i->numbers[i])
                .average();
       return myAverage.orElse(-50);
    }
}
