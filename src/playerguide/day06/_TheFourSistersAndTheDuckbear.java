package playerguide.day06;

/*
Day 6: Challenge - The Four Sisters and the Duckbear

Four sisters own a chocolate farm and collect chocolate eggs laid by chocolate chickens every day. But
more often than not, the number of eggs is not evenly divisible among the sisters, and everybody knows
you cannot split a chocolate egg into pieces without ruining it. The arguments have grown more heated
over time. The town is tired of hearing the four sisters complain, and Chandra, the town’s Arbiter, has
finally come up with a plan everybody can agree to. All four sisters get an equal number of chocolate
eggs every day, and the remainder is fed to their pet Duckbear. All that is left is to have some skilled
Programmer build a program to tell them how much each sister and the Duckbear should get.

Objectives:
Create a program that lets the user enter the number of chocolate eggs gathered that day.
Using / and %, compute how many eggs each sister should get and how many are left over for the Duckbear.
Answer this question: What are the total egg counts where the Duckbear gets more than each
sister does? You can use the program you created to help you find the answer.
 */

// importing the Java Scanner utility for user input
import java.util.Scanner;

public class _TheFourSistersAndTheDuckbear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many sisters are there?");
        String inputNumberOfSisters = input.nextLine();
        int numberOfSisters = Integer.valueOf(inputNumberOfSisters);

        System.out.println("How many eggs did the sisters find?");
        // Adjusted input.nextLine() to input.nextInt()
        int eggs = input.nextInt();
        input.nextLine();

        // Added this scanner input to test whether the previous input.nextLine() properly closed the scanner for the next input
        System.out.println("This is a test print, confirm with Yes or No");
        String Confirmation = input.nextLine();
        System.out.println("Your confirmation is " + Confirmation);

        int eggsPerSister = (int)((float)eggs / numberOfSisters);
        int eggsDuckbear = eggs - (eggsPerSister * numberOfSisters);

        String sidenote = null;
        if (eggs == 0) {
            sidenote = "No eggs were found this day, everyone went home hungry and duckbear received nothing as well";
        } else if (eggs == (eggsPerSister * numberOfSisters)) {
            sidenote = "All sisters gathered eggs equally, they returned home without complaining while duckbear was left hungry that day.";
        } else {
            sidenote = "The sisters returned home, split their eggs equally and gave the leftover " + eggsDuckbear + " egg(s) to duckbear.";
        }
        System.out.println(
                "In total " + eggs + " eggs have been found which means each sister gets: " + eggsPerSister + " egg(s)." +
                        "\n" + sidenote);

        // Find all cases where Duckbear gets more eggs than each sister
        int eggsCountTheoretical = 0;
        /* The upper limit for which the loop is required to check within to determine the
         * highest possible number of total eggs where Duckbear gets more than each sister
         */
        int eggsMaxDuckbear = ((numberOfSisters * (numberOfSisters - 1)) - 1);
        StringBuilder eggsDuckbearSuperiorString = new StringBuilder("However, in theory, Duckbear would get more eggs than each sister if the total egg counts are: ");
        int count = 0; // To keep track of how many numbers we've added to the string.

        /* this would count down from numberOfSisters^2 to find the eggsMaxDuckbear > eggsPerSister, but is more calculating and code than neccessary
        if ((((eggsMaxDuckbear/numberOfSisters) - Math.floor(eggsMaxDuckbear/numberOfSisters)) * numberOfSisters) > (Math.floor(eggsMaxDuckbear/numberOfSisters))) {
            eggsMaxChck = true;
        } else {
            eggsMaxChck = false;
        }
         */

        // Loop through all theoretical egg counts up to numberOfSisters^2
        while (eggsCountTheoretical < (numberOfSisters * numberOfSisters)) {
            // Calculate how many eggs each sister gets for this eggsCountTheoretical
            int eggsPerSisterTheoretical = eggsCountTheoretical / numberOfSisters;
            // Calculate how many eggs Duckbear gets for this eggsCountTheoretical
            int eggsForDuckbearTheoretical = eggsCountTheoretical % numberOfSisters;

            // Check if Duckbear gets more eggs than each sister in this scenario
            if (eggsForDuckbearTheoretical > eggsPerSisterTheoretical) {
                if (count > 0) {
                    // Currently only applies when numberOfSisters=4, chatGPT variation on this added to privateDiscordJavaThread
                    if (eggsCountTheoretical == eggsMaxDuckbear) {
                        eggsDuckbearSuperiorString.append(" and ");
                    } else {
                        eggsDuckbearSuperiorString.append(", ");
                    }
                }
                eggsDuckbearSuperiorString.append(eggsCountTheoretical);
                count++;
            }
            // Increment the theoretical count
            eggsCountTheoretical++;
        }

        // Check if we found any results and print them
        if (count > 0) {
            System.out.println(eggsDuckbearSuperiorString.toString() + ", if the total number of sisters is: " + numberOfSisters);
        } else {
            System.out.println("The sisters have to go find some eggs first!");
        }
    }
}

/*
Before the agreement:
//import DecimalFormat to format values with the correct amount of decimals
import java.text.DecimalFormat;
// importing the Java Scanner utility for user input
import java.util.Scanner;

public class TheFourSistersAndTheDuckbear {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs did Lindsey find?");
        String eggsLindsey = input.nextLine();
        int Lindsey = Integer.valueOf(eggsLindsey);

        System.out.println("Enter how many eggs Clarice has found");
        String eggsClarice = input.nextLine();
        int Clarice = Integer.valueOf(eggsClarice);

        System.out.println("How many eggs did Sarah find?");
        String eggsSarah = input.nextLine();
        int Sarah = Integer.valueOf(eggsSarah);

        System.out.println("And finally how many did Janet find?");
        String eggsJanet = input.nextLine();
        int Janet = Integer.valueOf(eggsJanet);

        int totalEggs = Lindsey + Clarice + Sarah + Janet;
        float pLindsey = (float) Lindsey / (float) totalEggs * 100;
        float pClarice = (float) Clarice / (float) totalEggs * 100;
        float pSarah = (float) Sarah / (float) totalEggs * 100;
        float pJanet = (float) Janet / (float) totalEggs * 100;

        String sidenote = null;
        if (totalEggs / 4 == Lindsey && totalEggs / 4 == Clarice && totalEggs / 4 == Sarah && totalEggs / 4 == Janet) {
            sidenote = "All sisters gathered eggs equally, they returned home without complaining while duckbear was left hungry that day.";
        } else {
            sidenote = "The sisters didn't gather an equal amount of eggs, they complained on their way home, maybe the town Arbiter can come up with a solution.";
        }

        // Format the decimal values in the println, because there it lets you reformat values to strings
        // without having to cast it and discard you original value type, in case you require it elsewhere,
        // while also avoiding the necessity of a 2nd variable(String) for each value, causing more code

        System.out.println(
                "In total " + totalEggs + " eggs have been found" +
                        "\n" +
                        "Lindsey has collected a total of " + Lindsey + " eggs, which is " + df.format(pLindsey) + "% of the total" +
                        "\n" +
                        "Clarice has collected a total of " + Clarice + " eggs" + " eggs, which is " + df.format(pClarice) + "% of the total" +
                        "\n" +
                        "Sarah has collected a total of " + Sarah + " eggs" + " eggs, which is " + df.format(pSarah) + "% of the total" +
                        "\n" +
                        "Janet has collected a total of " + Janet + " eggs" + " eggs, which is " + df.format(pJanet) + "% of the total" +
                        "\n" + sidenote);
    }
}
 */