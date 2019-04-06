package com.kodilla.testing.euclidian;

public class EuclideanAlgorithm {
    public static void main (String[] args) throws java.lang.Exception {

        int a = 84;
        int b = 16;
        while(b != 0) {
            int c;
            c = a % b;
            if (c == 0) {
                System.out.println("Greatest common divisor is " + b + ".");
                break;
            }else{
                a = b;
                b = c;
            }
        }
    }
}