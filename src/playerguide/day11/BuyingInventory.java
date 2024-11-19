package playerguide.day11;

/*
Day 11 Challenge 1 of 2: Buying Inventory

It is time to resupply. A nearby outfitter shop has the supplies you need but is so disorganized that they
cannot sell things to you. “Can’t sell if I can’t find the price list,” Tortuga, the owner, tells you as he turns
over and attempts to go back to sleep in his reclining chair in the corner.
There’s a simple solution: use your programming powers to build something to report the prices of
various pieces of equipment, based on the user’s selection:
The following items are available:

    Rope
    Torches
    Climbing Equipment
    Clean Water
    Machete
    Canoe
    Food Supplies

What number do you want to see the price of? 2
Torches cost 15 gold.
You search around the shop and find ledgers that show the following prices for these items: Rope: 10
gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold, Machete: 20 gold, Canoe: 200
gold, Food Supplies: 1 gold.

Objectives:
Build a program that will show the menu illustrated above.
Ask the user to enter a number from the menu.
Using the information above, use a switch (either type) to show the item’s cost.
*/

// Required imports
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BuyingInventory {

    // Shop arrays
    static int[] itemCount = {2, 2, 1, 7, 1, 0, 4};
    static String[] itemList = {"Rope", "Torches", "Climbing Equipment", "Clean Water", "Machete", "Canoe", "Food Supplies"};
    static float[] itemPrice = {1.50f, 1.00f, 5.00f, 0.50f, 3.00f, 15.00f, 2.50f};

    // Discounts
    static String[] discountUsers = {"Carlo","Siem","Marijn","Stefan"};
    static String selectedShopItem;
    static float selectedShopPrice;
    static int selectShopItemNumber;
    static float discount = 1.0f;

    public static void main(String[] args) {

        // Declaring imported methods for main
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        // Start of the shop program
        System.out.println("Hi there customer! What is your name?");
        String name = input.nextLine();

        // Determines if discount is applied, checks if the entered name is a match for the array of names that are eligible for discount regardless of UpperCase or LowerCase
        if (Arrays.stream(discountUsers).anyMatch(name::equalsIgnoreCase)) {
            discount = 0.5f;
        }

        // Builds and prints the list of items in the shop
        System.out.println("These are the items available currently in the store:");
        for (int i = 0; i < itemList.length; i++) {
            System.out.println("[" + (i + 1) + "] " + itemList[i] + " " + "-".repeat((20 - itemList[i].length())) + " available (" + itemCount[i] + ")");
        }
        System.out.println("Enter the [number] of the item above to select it");
        selectShopItemNumber = input.nextInt();

        // Prints the price of selected item
        if (discount != 1) {
            System.out.println("You currently have a " + (int) (100 * discount) + "% discount.");
        }
        System.out.println("The price of a " + selectionShopItem(selectShopItemNumber) + " is " + df.format(selectionShopPrice(selectShopItemNumber) * discount) + " gold.");
    }

    // Switch for item selection from array
    static String selectionShopItem(int selectShopItemNumber) {
        switch (selectShopItemNumber) {
            case 1:
                selectedShopItem = itemList[0];
                break;
            case 2:
                selectedShopItem = itemList[1];
                break;
            case 3:
                selectedShopItem = itemList[2];
                break;
            case 4:
                selectedShopItem = itemList[3];
                break;
            case 5:
                selectedShopItem = itemList[4];
                break;
            case 6:
                selectedShopItem = itemList[5];
                break;
            case 7:
                selectedShopItem = itemList[6];
                break;
            default:
                selectedShopItem = "Error";
        };
        return selectedShopItem;
    }

    // Switch for item price from array
    static float selectionShopPrice(int selectShopItemNumber) {
        switch (selectShopItemNumber) {
            case 1:
                selectedShopPrice = itemPrice[0];
                break;
            case 2:
                selectedShopPrice = itemPrice[1];
                break;
            case 3:
                selectedShopPrice = itemPrice[2];
                break;
            case 4:
                selectedShopPrice = itemPrice[3];
                break;
            case 5:
                selectedShopPrice = itemPrice[4];
                break;
            case 6:
                selectedShopPrice = itemPrice[5];
                break;
            case 7:
                selectedShopPrice = itemPrice[6];
                break;
            default:
                selectedShopPrice = 0f;
        };
        return selectedShopPrice;
    }
}
