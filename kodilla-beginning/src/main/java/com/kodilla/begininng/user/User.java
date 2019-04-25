package com.kodilla.begininng.user;

public class User {
    public boolean printName(String name) {

        if(name != null) {
            System.out.println(name);
            return true;
        } else {
            System.out.print("Error, you have to print in your name");
            return false;
        }
    }
    public void olderAndHigherOrYoungerOrLower(double age, double height) {
        if(age > 30 && height > 160) {
            System.out.println("User is older than 30 y.o. and higher then 160 cm");
        } else {
            System.out.println("User is either younger than 30 y.o. or lower than 160 cm or both");
        }
    }
}
