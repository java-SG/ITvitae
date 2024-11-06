package playerguide.day10;

/*Day 10: Challenge: Watchtower

There are watchtowers in the region around Consolas that can alert
you when an enemy is spotted. With some help from you, they can tell
you which direction the enemy is from the watchtower.

Objectives:
Ask the user for an x value and a y value. These are coordinates of
the enemy relative to the watchtower’s location. Positive x-values are east, positive y-values are north (as they would be on a normal graph)
Using if statements and relational operators, display a message about what direction the enemy is coming from. For example, “The enemy is to the northwest!” or “The enemy is here!
*/

// import DecimalFormat to format values with the correct amount of decimals
import java.text.DecimalFormat;
import java.util.Scanner;

public class xy_Watchtower {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        System.out.println("What is the value for the enemies' location on the x-axis?");
        float x = input.nextFloat();
        System.out.println("And what is the value for the enemies' location on the y-axis?");
        float y = input.nextFloat();

        double radius = Math.sqrt((x*x) + (y*y));
        System.out.println("with a distance of " + df.format(radius) + " units");

        String Loc = "";
/*
        // This if checks if the enemy is already at the location
        if (x == 0 && y == 0) {
            System.out.println("The enemy is here!");
        } else {
            // if the vertical (y) coordinate of the enemy is exactly 0, it will point precisely into a direction
            if (y == 0) {
                Loc = "directly to the ";
                // if the vertical (y) coordinate of the enemy is more than half of what the horizontal (x) coordinate it, it will point jointly into the direction of the enemy with the horizontal (x) coordinate result, or solely.
            } else if ((Math.abs(y) * 2) <= (Math.abs(x))) {
            } else {
                if (y < 0) {
                    Loc = "South";
                } else if (y > 0) {
                    Loc = "North";
                }
            }
            if (x == 0) {
                // Concatenates the vertical Loc with "directly to the" in case the horizontal axis is 0, for precision.
                Loc = "directly to the " + Loc;

            } else if ((Math.abs(x) * 2) <= (Math.abs(y))) {
            } else {
                if (x < 0) {
                    Loc = Loc + "West";
                } else if (x > 0) {
                    Loc = Loc + "East";
                }
            }
            System.out.println("The enemy is located " + Loc + " (X" + x + ",Y" + y + ")");
        }
        */
    }
}