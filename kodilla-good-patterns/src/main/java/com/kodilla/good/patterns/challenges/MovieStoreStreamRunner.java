package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreStreamRunner {
    public static void main (String[]args){
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> myHeroMovies = movieStore.getMovies();

        String theResultStringOfMovies =  myHeroMovies.entrySet().stream()
               .flatMap(l -> l.getValue().stream())
               .collect(Collectors.joining("!","<<",">>"));

        System.out.println(theResultStringOfMovies);
    }
}
