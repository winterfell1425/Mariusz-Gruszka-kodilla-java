package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("oh, blue rose!!!",(poem) -> poem.toUpperCase());
        poemBeautifier.beautify("red rose???",(poem) -> "ABC" + poem + "ABC");
        poemBeautifier.beautify("YELLOW ROSE....",(poem) -> poem.toLowerCase());
        poemBeautifier.beautify("White, white Rose!;%@,,;",(poem) -> poem.substring(7, 17));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
