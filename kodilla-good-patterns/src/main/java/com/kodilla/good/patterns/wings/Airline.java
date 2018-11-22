package com.kodilla.good.patterns.wings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Airline {

    public List<Flight> getFlights() {

        List<Flight> airlineFlights = new ArrayList<>();
        airlineFlights.add(new Flight("Warszawa", "Kraków"));
        airlineFlights.add(new Flight("Kraków", "Wrocław"));
        airlineFlights.add(new Flight("Wrocław", "Poznań"));


        return airlineFlights;
    }
    public List <Flight> findFlightFrom(String airport){
        return getFlights().stream()
                .filter(f->f.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
    }
    public List <Flight> findFlightTo(String airport){
        return getFlights().stream()
                .filter(f->f.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
    }
    public List <Flight> findFlightThrough(String from,String via,String to){
        List<Flight> result = getFlights().stream()
                .filter(f->f.getDepartureAirport().equals(from))
                .filter(f->f.getArrivalAirport().equals(via))
                .collect(Collectors.toList());
        result.addAll(getFlights().stream()
                .filter(f->f.getDepartureAirport().equals(via))
                .filter(f->f.getArrivalAirport().equals(to))
                .collect(Collectors.toList()));
        return result;
    }
}

