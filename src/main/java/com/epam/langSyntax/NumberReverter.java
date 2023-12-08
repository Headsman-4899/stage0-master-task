package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        if (number >= 100 && number <= 999) {
            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = number / 100;

            int result = digit1 * 100 + digit2 * 10 + digit3;

            System.out.println(result);
        } else {
            System.out.println("provide a 3-digit number.");
        }
    }

}
