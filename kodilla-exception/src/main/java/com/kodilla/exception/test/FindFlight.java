package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    private Map<String, Boolean> warsawDestinationAirports = new HashMap<>();

    public FindFlight() {
        warsawDestinationAirports.put("London", true);
        warsawDestinationAirports.put("Moscow", true);
        warsawDestinationAirports.put("Auckland", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (warsawDestinationAirports.containsKey(flight.getArrivalAirport())) {
            return warsawDestinationAirports.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}





