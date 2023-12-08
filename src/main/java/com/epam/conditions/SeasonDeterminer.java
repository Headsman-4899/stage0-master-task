package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            String season = switch (monthNumber) {
                case 1, 2, 12 -> "Winter";
                case 3, 4, 5 -> "Spring";
                case 6, 7, 8 -> "Summer";
                case 9, 10, 11 -> "Autumn";
                default -> "Wrong month number";
            };
            System.out.println(season);
        } else {
            System.out.println("Wrong month number");
        }
    }

}
