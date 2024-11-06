package playerguide.day07;

/*
Day 7: Challenge The Dominion of Kings

Three kings, Melik, Casik, and Balik, are sitting around a table, debating who has the greatest kingdom
among them. Each king rules an assortment of provinces, duchies, and estates. Collectively, they agree
to a point system that helps them judge whose kingdom is greatest: Every estate is worth 1 point, every
duchy is worth 3 points, and every province is worth 6 points. They just need a program that will allow
them to enter their current holdings and compute a point total.

Objectives:
Create a program that allows users to enter how many provinces, duchies, and estates they have.
Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
Display the point total to the user.
 */

// importing the Java Scanner utility for user input
import java.util.Scanner;

// the input.nextLine()'s could have been input.nextInt()'s, though at the time I didn't know this, now I do!
/* This was the old code, rewritten below with input.nextInt()'s
public class TheDominionOfKings {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("To end the debate between the three kings, Melik, Casik, and Balik about who's kingdom is greatest, we require the number of provinces, duchies and estates each king owns");
            // Melik
            System.out.println("First Melik enters his ownerships of his Provinces:");
            String melikProvinces = input.nextLine();
            System.out.println("Then his ownerships of the number of Duchies:");
            String melikDuchies = input.nextLine();
            System.out.println("And finally amount of Estates Melik has ownership of:");
            String melikEstates = input.nextLine();
            int melikPoints = (Integer.parseInt(melikProvinces) * 6) + (Integer.parseInt(melikDuchies) * 3) + (Integer.parseInt(melikEstates) * 1);
            // Casik
            System.out.println("First casik enters his ownerships of his Provinces:");
            String casikProvinces = input.nextLine();
            System.out.println("Then his ownerships of the number of Duchies:");
            String casikDuchies = input.nextLine();
            System.out.println("And finally amount of Estates casik has ownership of:");
            String casikEstates = input.nextLine();
            int casikPoints = (Integer.parseInt(casikProvinces) * 6) + (Integer.parseInt(casikDuchies) * 3) + (Integer.parseInt(casikEstates) * 1);
            // Balik
            System.out.println("First balik enters his ownerships of his Provinces:");
            String balikProvinces = input.nextLine();
            System.out.println("Then his ownerships of the number of Duchies:");
            String balikDuchies = input.nextLine();
            System.out.println("And finally amount of Estates balik has ownership of:");
            String balikEstates = input.nextLine();
            int balikPoints = (Integer.parseInt(balikProvinces) * 6) + (Integer.parseInt(balikDuchies) * 3) + (Integer.parseInt(balikEstates) * 1);

            System.out.println("Melik owns " + melikProvinces + " Provinces, " + melikDuchies + " Duchies and " + melikEstates + " Estates, which amounts to a point total of " + melikPoints);
            System.out.println("Casik owns " + casikProvinces + " Provinces, " + casikDuchies + " Duchies and " + casikEstates + " Estates, which amounts to a point total of " + casikPoints);
            System.out.println("and Balik owns " + balikProvinces + " Provinces, " + balikDuchies + " Duchies and " + balikEstates + " Estates, which amounts to a point total of " + balikPoints);
        }
    }
*/

/*
Day 7: Challenge The Dominion of Kings

Three kings, Melik, Casik, and Balik, are sitting around a table, debating who has the greatest kingdom
among them. Each king rules an assortment of provinces, duchies, and estates. Collectively, they agree
to a point system that helps them judge whose kingdom is greatest: Every estate is worth 1 point, every
duchy is worth 3 points, and every province is worth 6 points. They just need a program that will allow
them to enter their current holdings and compute a point total.

Objectives:
Create a program that allows users to enter how many provinces, duchies, and estates they have.
Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
Display the point total to the user.
*/

// importing the Java Scanner utility for user input
import java.util.Scanner;

// the input.nextInt()'s could have been input.nextInt()'s, though at the time I didn't know this, now I do!
public class TheDominionOfKings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To end the debate between the three kings, Melik, Casik, and Balik about who's kingdom is greatest, we require the number of provinces, duchies and estates each king owns");
        // Melik
        System.out.println("First Melik enters his ownerships of his Provinces:");
        int melikProvinces = input.nextInt();
        System.out.println("Then his ownerships of the number of Duchies:");
        int melikDuchies = input.nextInt();
        System.out.println("And finally amount of Estates Melik has ownership of:");
        int melikEstates = input.nextInt();
        int melikPoints = (melikProvinces * 6) + (melikDuchies * 3) + (melikEstates * 1);
        // Casik
        System.out.println("First casik enters his ownerships of his Provinces:");
        int casikProvinces = input.nextInt();
        System.out.println("Then his ownerships of the number of Duchies:");
        int casikDuchies = input.nextInt();
        System.out.println("And finally amount of Estates casik has ownership of:");
        int casikEstates = input.nextInt();
        int casikPoints = (casikProvinces * 6) + (casikDuchies * 3) + (casikEstates * 1);
        // Balik
        System.out.println("First balik enters his ownerships of his Provinces:");
        int balikProvinces = input.nextInt();
        System.out.println("Then his ownerships of the number of Duchies:");
        int balikDuchies = input.nextInt();
        System.out.println("And finally amount of Estates balik has ownership of:");
        int balikEstates = input.nextInt();
        int balikPoints = (balikProvinces * 6) + (balikDuchies * 3) + (balikEstates * 1);

        System.out.println("Melik owns " + melikProvinces + " Provinces, " + melikDuchies + " Duchies and " + melikEstates + " Estates, which amounts to a point total of " + melikPoints);
        System.out.println("Casik owns " + casikProvinces + " Provinces, " + casikDuchies + " Duchies and " + casikEstates + " Estates, which amounts to a point total of " + casikPoints);
        System.out.println("and Balik owns " + balikProvinces + " Provinces, " + balikDuchies + " Duchies and " + balikEstates + " Estates, which amounts to a point total of " + balikPoints);
    }
}
