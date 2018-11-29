package com.kodilla.good.patterns.wings;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Airline airline = new Airline();
        List<Flight> flight1 = airline.findFlightFrom("Warszawa");
        List<Flight> flight2 = airline.findFlightTo("Wrocław");
        List<Flight> flight3 = airline.findFlightThrough("Warszawa", "Kraków", "Wrocław");

        System.out.println(flight1);
        System.out.println(flight2);
        System.out.println(flight3);
    }
}
