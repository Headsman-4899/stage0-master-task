package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("first quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("second quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("third quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("fourth quadrant.");
        } else if (x == 0 && y == 0) {
            System.out.println("zero.");
        } else {
            System.out.println("The coordinate point is on one of the axes.");
        }
    }

}

