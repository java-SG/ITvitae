package school.opdrachten;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner time_input = new Scanner(System.in);
        System.out.println("Enter an amount of years");
        int time_years = time_input.nextInt();
        System.out.println("Enter an amount of months");
        int time_months = time_input.nextInt();
        System.out.println("Enter an amount of weeks");
        int time_weeks = time_input.nextInt();
        System.out.println("Enter an amount of days");
        int time_days = time_input.nextInt();
        System.out.println("Enter an amount of hours");
        int time_hours = time_input.nextInt();

        int years_minutes = time_years * 365 * 24 * 60;
        int months_minutes = time_months * 30 * 24 * 60;
        int weeks_minutes = time_weeks * 7 * 24 * 60;
        int days_minutes = time_days * 24 * 60;
        int hours_minutes = time_hours * 60;

        System.out.println(time_years + " year(s) = " + years_minutes + " minutes.");
        System.out.println(time_months + " month(s) = " + months_minutes + " minutes.");
        System.out.println(time_weeks + " week(s) = " + weeks_minutes + " minutes.");
        System.out.println(time_days + " day(s) = " + days_minutes + " minutes.");
        System.out.println(time_hours + " hour(s) = " + hours_minutes + " minutes.");
        System.out.println("In total all entries of time come to: " + (years_minutes + months_minutes + weeks_minutes + days_minutes + hours_minutes) + " minutes.");
    }
}
