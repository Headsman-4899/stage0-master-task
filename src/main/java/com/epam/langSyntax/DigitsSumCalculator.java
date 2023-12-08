package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        if (number >= 1000 && number <= 9999) {
            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = (number / 100) % 10;
            int digit4 = number / 1000;

            int sum = digit1 + digit2 + digit3 + digit4;

            System.out.println(sum);
        } else {
            System.out.println("provide a 4-digit number.");
        }
    }

}
