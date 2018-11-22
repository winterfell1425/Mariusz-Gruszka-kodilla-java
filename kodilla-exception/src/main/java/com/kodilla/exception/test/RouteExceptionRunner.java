package com.kodilla.exception.test;

public class RouteExceptionRunner {
    public static void main(String[] args) {

        FindFlight flightFinder = new FindFlight();

        try {
            boolean result = flightFinder.findFlight(new Flight("Warsaw", "London"));
            System.out.println(result);
        } catch (RouteNotFoundException e) {
            System.out.println("No such airport exists in database");
        } finally {
            System.out.println("End of a quarry");
        }
    }
}
