package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        long result = 1;

        for (int i = 0; i < power; i++) {
            result *= numberToPrint;
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
