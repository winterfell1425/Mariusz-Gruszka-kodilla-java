package com.kodilla.begininng.user;

public class Application {
    public static void main (String[] args) {

        String name = "Adam";
        double age = 20.5;
        double height = 178;

        User adam = new User();

        boolean hasName = adam.printName(name);

        if(hasName) {
            adam.olderAndHigherOrYoungerOrLower(age, height);
        }
    }
}
