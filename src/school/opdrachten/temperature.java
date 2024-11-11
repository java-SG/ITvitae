package school.opdrachten;

import java.text.DecimalFormat;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner input = new Scanner(System.in);

        int i = 0;

        while (i == 0) {
            System.out.println("Do you want to convert \"Celcius\" or \"Fahrenheit?\"");
            String choice = input.nextLine();

            if (choice.toLowerCase().equals("celsius")) {
                System.out.println("Enter the temperature in Celcius you wish to convert to Fahrenheit");
                float celcius = input.nextFloat();
                float fahrenheit = (celcius * 1.8f) + 32;
                System.out.println(df.format(celcius) + "°C in Fahrenheit is: " + df.format(fahrenheit) + "°F.");
                i = 1;
            } else if (choice.toLowerCase().equals("fahrenheit")) {
                System.out.println("Enter the temperature in Fahrenheit you wish to convert to Celsius");
                float fahrenheit = input.nextFloat();
                float celsius = (fahrenheit - 32) / 1.8f;
                System.out.println(df.format(fahrenheit) + "°F in Fahrenheit is: " + df.format(celsius) + "°C.");
                i = 1;
            } else {
                System.out.println("The input you entered does not match celsius nor fahrenheit, try again!");
            }
        }
    }
}
