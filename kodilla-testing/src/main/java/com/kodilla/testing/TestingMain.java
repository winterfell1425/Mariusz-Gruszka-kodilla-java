package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator1 = new Calculator();
        int result1 = calculator1.add(5,2);
        if (result1 == 7) {
            System.out.println("Result = " + result1 + "; test OK.");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator2 = new Calculator();
        int result2 = calculator2.subtract(5,2);
        if (result2 == 3) {
            System.out.println("Result = " + result2 + "; test OK.");
        } else {
            System.out.println("Error!");
        }
    }
}
