package com.epam.conditions;

public class DaysInMonth {

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("Invalid date: Negative years are not accepted.");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid date: Month should be between 1 and 12.");
            return;
        }

        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };

        System.out.println("The number of days in month " + month + " of year " + year + " is: " + daysInMonth + " days.");
    }

}
