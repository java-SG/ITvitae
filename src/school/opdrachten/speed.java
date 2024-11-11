package school.opdrachten;

import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Distance input
        System.out.println("To check your speed, enter the distance travelled in metres:");
        int metres = input.nextInt();

        // Time input
        System.out.println("Now to calculate the speed, enter the hours travelled:");
        int hours = input.nextInt();
        System.out.println("Now to calculate the speed, enter the minutes travelled:");
        int minutes = input.nextInt();
        System.out.println("Now to calculate the speed, enter the seconds travelled:");
        int seconds = input.nextInt();

        float hours_total = hours + (minutes / 60f) + (seconds / 3600f);
        float seconds_total = (hours * 3600f) + (minutes * 60f) + seconds;
        float km_total = (metres / 1000f);
        float miles_total = (metres / 1609f);
;
        float ms = (metres / seconds_total);
        float kmh = (km_total / hours_total);
        float mph = (miles_total / hours_total);

        System.out.println("Your speed in miles per second = " + ms);
        System.out.println("Your speed in kilometres per hour = " + kmh);
        System.out.println("Your speed in miles per hour = " + mph);
    }
}
