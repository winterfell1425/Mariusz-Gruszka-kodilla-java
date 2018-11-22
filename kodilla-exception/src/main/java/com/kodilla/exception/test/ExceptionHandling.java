package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge challenge2 = new SecondChallenge();

        try {
            String myChallenge = challenge2.probablyIWillThrowException(0.7, 1.6);
            System.out.println(myChallenge);
        } catch (Exception e) {
            System.out.println("Exception!!!\nFor 'x' you need to input a number that is bigger than 1.0 and lower than 2.0.\nFor 'y' you need to input a number other than 1.5.");
        } finally {
            System.out.println("End of second challenge.");
        }
    }
}
